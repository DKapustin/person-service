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

    public long getId() {
        return this.id;
    }

    public long getMedicalCardId() {
        return this.medicalCardId;
    }

    public long getTypeId() {
        return this.typeId;
    }

    public char getHeaviness() {
        return this.heaviness;
    }

    public Time getAppearanceDttm() {
        return this.appearanceDttm;
    }

    public Date getRecoveryDt() {
        return this.recoveryDt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMedicalCardId(long medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public void setTypeId(long typeId) {
        this.typeId = typeId;
    }

    public void setHeaviness(char heaviness) {
        this.heaviness = heaviness;
    }

    public void setAppearanceDttm(Time appearanceDttm) {
        this.appearanceDttm = appearanceDttm;
    }

    public void setRecoveryDt(Date recoveryDt) {
        this.recoveryDt = recoveryDt;
    }
}
