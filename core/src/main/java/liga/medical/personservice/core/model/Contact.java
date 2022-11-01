package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Contact {
    @Id
    private long id;

    private String phoneNumber;

    private String email;

    private String profileLink;

}
