package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface RoleMapper {

    @Select("SELECT * FROM medical.role")
    List<Role> getAllRole();

    @Select("SELECT * FROM medical.role WHERE name = #{name}")
    Role getRoleByName(@Param("name") String name);
}
