package liga.medical.personservice.core.mapping;

import liga.medical.personservice.core.model.MedicalCard;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MedicalCardMapper {

    @Select("SELECT id, client_status as clientStatus, med_status as medStatus, registry_dt as registryDt, comment " +
            "FROM medical.medical_card")
    List<MedicalCard> getAllMedicalCard();

    @Select("SELECT id, client_status as clientStatus, med_status as medStatus, registry_dt as registryDt, comment " +
            "FROM medical.medical_card WHERE id = #{medicalCardId}")
    MedicalCard getMedicalCardById(@Param("medicalCardId") long medicalCardId);

    @Insert("INSERT INTO medical.medical_card (id, client_status, med_status, registry_dt, comment) " +
            "VALUES (#{id}, #{clientStatus}, #{medStatus}, #{registryDt}, #{comment})")
    int addMedicalCard(MedicalCard medicalCard);
}
