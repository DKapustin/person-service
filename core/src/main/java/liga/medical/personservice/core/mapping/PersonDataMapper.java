package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.PersonData;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PersonDataMapper {

    @Select("SELECT id, last_name as lastName, first_name as firstName, birth_dt as birthDt, age, sex, " +
            "contact_id as contactId, medical_card_id as medicalCardId, parent_id as parentId " +
            "FROM medical.person_data")
    List<PersonData> getAllPersonData();

    @Select("SELECT id, last_name as lastName, first_name as firstName, birth_dt as birthDt, age, sex," +
            " contact_id as contactId, medical_card_id as medicalCardId, parent_id as parentId " +
            "FROM medical.person_data WHERE id = #{personDataId}")
    PersonData getPersonDataById(@Param("personDataId") long personDataId);

    @Insert("INSERT INTO medical.person_data " +
            "VALUES (#{id}, #{lastName}, #{firstName}, #{birthDt}, #{age}, #{sex}, #{contactId}, #{medicalCardId}, #{parentId})")
    int addPersonData(PersonData personData);

    @Delete("DELETE FROM medical.person_data WHERE id = #{personDataId}")
    void deletePersonDataById(@Param("personDataId") long personDataId);
}
