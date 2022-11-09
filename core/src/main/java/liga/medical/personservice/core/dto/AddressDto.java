package liga.medical.personservice.core.dto;

import lombok.Data;

@Data
public class AddressDto {
    private final long id;

    private final long contactId;

    private final long countryId;

    private final String city;

    private final Integer index;

    private final String street;

    private final String building;

    private final String flat;

}
