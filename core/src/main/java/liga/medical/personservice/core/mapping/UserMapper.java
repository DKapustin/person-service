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

    @Select("SELECT * FROM medical.user")
    List<User> getAllUser();

    @Select("SELECT * FROM medical.user WHERE login = #{login}")
    User getUserByLogin(@Param("login") String login);

    @Select("SELECT * FROM medical.user WHERE id = #{userId}")
    User getUserById(@Param("userId") long userId);

    @Insert("INSERT INTO medical.user VALUES (#{id}, #{login}, #{password})")
    int addUser(User user);

    @Select("SELECT * FROM medical.role WHERE id IN (SELECT role_id FROM medical.user_role WHERE user_id = #{userId})")
    Set<Role> getUserRoles(@Param("userId") long userId);
}
