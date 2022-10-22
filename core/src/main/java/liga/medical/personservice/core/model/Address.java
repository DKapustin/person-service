package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.math.BigInteger;


@Data
public class Address {
    @Id
    private BigInteger id;

    private Contact contactId;

    private BigInteger countryId;

    private String city;

    private Integer index;

    private String street;

    private String building;

    private String flat;

    public BigInteger getId() {
        return this.id;
    }

    public Contact getContactId() {
        return this.contactId;
    }

    public BigInteger getCountryId() {
        return this.countryId;
    }

    public String getCity() {
        return this.city;
    }

    public Integer getIndex() {
        return this.index;
    }

    public String getStreet() {
        return this.street;
    }

    public String getBuilding() {
        return this.building;
    }

    public String getFlat() {
        return this.flat;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public void setContactId(Contact contactId) {
        this.contactId = contactId;
    }

    public void setCountryId(BigInteger countryId) {
        this.countryId = countryId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
