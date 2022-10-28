package liga.medical.personservice.core.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Address {
    @Id
    private long id;

    private long contactId;

    private long countryId;

    private String city;

    private Integer index;

    private String street;

    private String building;

    private String flat;

    public long getId() {
        return this.id;
    }

    public long getContactId() {
        return this.contactId;
    }

    public long getCountryId() {
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

    public void setId(long id) {
        this.id = id;
    }

    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public void setCountryId(long countryId) {
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
