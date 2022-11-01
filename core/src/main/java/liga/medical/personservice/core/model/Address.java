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

}
