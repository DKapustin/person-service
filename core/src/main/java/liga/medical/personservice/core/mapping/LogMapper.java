package liga.medical.personservice.core.mapping;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    @Insert("INSERT INTO auth_log VALUES (#{id}, #{date}, #{time}, #{userName});")
    Integer logAuth(String logAuthDto);
}
