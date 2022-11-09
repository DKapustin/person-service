package liga.medical.personservice.core.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class MedicalCardDto {
    private final long id;

    private final char clientStatus;

    private final char medStatus;

    private final Date registryDt;

    private final String comment;
}
