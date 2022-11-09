package liga.medical.personservice.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Date;

@Data
@NoArgsConstructor
public class PersonData {
    @Id
    private long id;

    private String lastName;

    private String firstName;

    private Date birthDt;

    private int age;

    private char sex;

    private long contactId;

    private long medicalCardId;

    private long parentId;

}
