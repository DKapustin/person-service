package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;


import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;

@Data
public class Illness {
    @Id
    private BigInteger id;
    private MedicalCard medicalCardId;
    private BigInteger typeId;
    private char heaviness;
    private Time appearanceDttm;
    private Date recoveryDt;

    public BigInteger getId() {
        return this.id;
    }

    public MedicalCard getMedicalCardId() {
        return this.medicalCardId;
    }

    public BigInteger getTypeId() {
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

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setMedicalCardId(MedicalCard medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public void setTypeId(BigInteger typeId) {
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
