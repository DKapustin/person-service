package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;

@Data
public class Contact {
    @Id
    private BigInteger id;

    private String phoneNumber;

    private String email;

    private String profileLink;

    public BigInteger getId() {
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

    public void setId(BigInteger id) {
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
