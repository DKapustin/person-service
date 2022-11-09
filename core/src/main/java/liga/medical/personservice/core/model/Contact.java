package liga.medical.personservice.core.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
public class Contact {
    @Id
    private long id;

    private String phoneNumber;

    private String email;

    private String profileLink;

}
