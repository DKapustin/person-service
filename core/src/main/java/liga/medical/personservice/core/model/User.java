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

    public long getId() {
        return this.id;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
