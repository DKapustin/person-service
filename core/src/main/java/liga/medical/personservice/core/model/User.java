package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
public class User {

    @Id
    private long id;

    private String login;

    private String password;

    private Set<Role> roles;

}
