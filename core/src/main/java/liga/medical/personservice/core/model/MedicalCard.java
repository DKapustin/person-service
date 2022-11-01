package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Data
public class MedicalCard {
    @Id
    private long id;

    private char clientStatus;

    private char medStatus;

    private Date registryDt;

    private String comment;
}
