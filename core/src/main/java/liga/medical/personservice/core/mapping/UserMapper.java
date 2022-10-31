package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Role;
import liga.medical.personservice.core.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user;")
    List<User> getAllUser();

    @Select("SELECT * WHERE login = #{login} " +
            "FROM user;")
    User getUserByLogin(@Param("login") String login);

    @Select("SELECT * WHERE id = #{userId} " +
            "FROM user;")
    User getUserById(@Param("userId") long userId);

    @Insert("INSERT INTO user VALUES (#{id}, #{login}, #{password})")
    int addUser(User user);

    @Select("SELECT * FROM role WHERE id IN (SELECT role_id FROM user_role WHERE user_id = #{userId})")
    Set<Role> getUserRoles(@Param("userId") long userId);
}
