package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Date;
import java.sql.Time;

@Data
public class Illness {
    @Id
    private long id;
    private long medicalCardId;
    private long typeId;
    private char heaviness;
    private Time appearanceDttm;
    private Date recoveryDt;

}
