package liga.medical.personservice.core.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class PersonDataDto {
    private final long id;

    private final String lastName;

    private final String firstName;

    private final Date birthDt;

    private final int age;

    private final char sex;

    private final long contactId;

    private final long medicalCardId;

    private final long parentId;
}
