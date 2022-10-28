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

    public long getId() {
        return id;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public String getProfileLink() {
        return this.profileLink;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setProfileLink(String profileLink) {
        this.profileLink = profileLink;
    }
}
