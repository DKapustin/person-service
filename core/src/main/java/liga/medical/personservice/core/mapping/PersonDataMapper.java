package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.PersonData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonDataMapper {

    @Select("SELECT id, last_name as lastName, first_name as firstName, birth_dt as birthDt, age, sex, " +
            "contact_id as contactId, medical_card_id as medicalCardId, parent_id as parentId " +
            "FROM person_data;")
    List<PersonData> getAllPersonData();

    @Select("SELECT id, last_name as lastName, first_name as firstName, birth_dt as birthDt, age, sex," +
            " contact_id as contactId, medical_card_id as medicalCardId, parent_id as parentId " +
            "FROM person_data WHERE id = #{personDataId};")
    PersonData getPersonDataById(@Param("personDataId") long personDataId);

    @Insert("INSERT INTO person_data " +
            "VALUES (#{id}, #{lastName}, #{firstName}, #{birthDt}, #{age}, #{sex}, #{contactId}, #{medicalCardId}, #{parentId});")
    int addPersonData(PersonData personData);
}
