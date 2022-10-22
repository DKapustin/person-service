package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import java.sql.Date;

@Data
public class MedicalCard {
    @Id
    private MedicalCard id;
    private char clientStatus;
    private char medStatus;
    private Date registryDt;
    private String comment;

    public MedicalCard getId() {
        return id;
    }

    public char getClientStatus() {
        return this.clientStatus;
    }

    public char getMedStatus() {
        return this.medStatus;
    }

    public Date getRegistryDt() {
        return this.registryDt;
    }

    public String getComment() {
        return this.comment;
    }

    public void setId(MedicalCard id) {
        this.id = id;
    }

    public void setClientStatus(char clientStatus) {
        this.clientStatus = clientStatus;
    }

    public void setMedStatus(char medStatus) {
        this.medStatus = medStatus;
    }

    public void setRegistryDt(Date registryDt) {
        this.registryDt = registryDt;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
