package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;
import java.sql.Date;

@Data
public class PersonData {
    @Id
    private BigInteger id;
    private String lastName;
    private String firstName;
    private Date birthDt;
    private int age;
    private char sex;
    private Contact contactId;
    private MedicalCard medicalCardId;
    private PersonData parentId;

    public BigInteger getId() {
        return this.id;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public Date getBirthDt() {
        return this.birthDt;
    }

    public int getAge() {
        return this.age;
    }

    public char getSex() {
        return this.sex;
    }

    public Contact getContactId() {
        return this.contactId;
    }

    public MedicalCard getMedicalCardId() {
        return this.medicalCardId;
    }

    public PersonData getParentId() {
        return this.parentId;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setBirthDt(Date birthDt) {
        this.birthDt = birthDt;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setContactId(Contact contactId) {
        this.contactId = contactId;
    }

    public void setMedicalCardId(MedicalCard medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public void setParentId(PersonData parentId) {
        this.parentId = parentId;
    }
}
