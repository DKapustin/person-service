package liga.medical.personservice.core.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class IllnessDto {
    private final long id;
    private final long medicalCardId;
    private final long typeId;
    private final char heaviness;
    private final Time appearanceDttm;
    private final Date recoveryDt;
}
