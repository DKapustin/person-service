package liga.medical.personservice.core.service;

import liga.medical.personservice.core.security.SecurityUser;
import liga.medical.personservice.core.mapping.UserMapper;
import liga.medical.personservice.core.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserMapper userMapper;

    public UserDetailsServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        //System.out.println("login = "+login);
        User user = userMapper.getUserByLogin(login);
        if (user == null) {
            System.out.println("user is null");
            throw new UsernameNotFoundException("User '" + login + "' doesn't exists");
        }
        return SecurityUser.fromUser(userMapper.getUserByLogin(login));
    }
}
