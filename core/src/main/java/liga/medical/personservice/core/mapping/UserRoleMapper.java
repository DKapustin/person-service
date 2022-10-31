package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.dto.UserRoleDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserRoleMapper {
    @Insert("INSERT INTO user_role VALUES (#{userId}, 1)")
    int addAdminRole(@Param("userId") long userId);

    @Insert("INSERT INTO user_role VALUES (#{userId}, 2)")
    int addOrdinaryUserRole(@Param("userId") long userId);

    @Insert(value = "INSERT INTO users_roles VALUES (#{userId}, #{roleId});")
    int addUserRole(UserRoleDto userRoleDto);
}
