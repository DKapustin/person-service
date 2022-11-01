package liga.medical.personservice.core.service;

import liga.medical.personservice.core.dto.UserRoleDto;
import liga.medical.personservice.core.mapping.RoleMapper;
import liga.medical.personservice.core.mapping.UserMapper;
import liga.medical.personservice.core.mapping.UserRoleMapper;
import liga.medical.personservice.core.model.Role;
import liga.medical.personservice.core.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    private UserMapper userMapper;

    private RoleMapper roleMapper;

    private UserRoleMapper userRoleMapper;

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserMapper userMapper, RoleMapper roleMapper, UserRoleMapper userRoleMapper, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
        this.userRoleMapper = userRoleMapper;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public void addUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        userMapper.addUser(user);
        User userWithId = userMapper.getUserByLogin(user.getLogin());
        setDefaultRole(userWithId);
        for (UserRoleDto userRoleDto: UserRoleDto.fromUser(userWithId)) {
            userRoleMapper.addUserRole(userRoleDto);
        }
    }

    public User findUserByLogin(String login) {
        return userMapper.getUserByLogin(login);
    }

    private void setDefaultRole(User user) {
        Set<Role> roleSet = new HashSet<>();
        Role role = roleMapper.getRoleByName("USER");
        roleSet.add(role);
        user.setRoles(roleSet);
    }

    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        User user = userMapper.getUserByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }

        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        user.getRoles().stream().forEach(x->grantedAuthorities.add(new SimpleGrantedAuthority(x.getName())));

        return new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), grantedAuthorities);
    }

}
