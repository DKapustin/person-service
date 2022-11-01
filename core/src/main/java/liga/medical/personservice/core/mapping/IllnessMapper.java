package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.Illness;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IllnessMapper {

    @Select("SELECT id, medical_card_id as medicalCardId, type_id as typeId, heaviness, appearance_dttm as appearanceDttm, recovery_dt as recoveryDt " +
            "FROM medical.illness")
    List<Illness> getAllIllness();

    @Select("SELECT id, medical_card_id as medicalCardId, type_id as typeId, heaviness, appearance_dttm as appearanceDttm, recovery_dt as recoveryDt " +
            "FROM medical.illness WHERE id = #{illnessId}")
    Illness getIllnessById(@Param("illnessId") long illnessId);

    @Insert("INSERT INTO medical.illness (id, medical_card_id, type_id, heaviness, appearance_dttm, recovery_dt) " +
            "VALUES (#{id}, #{medicalCardId}, #{typeId}, #{heaviness}, #{appearanceDttm}, #{recoveryDt})")
    int addIllness(Illness illness);
}
