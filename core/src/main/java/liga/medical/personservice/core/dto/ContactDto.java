package liga.medical.personservice.core.dto;

import lombok.Data;

@Data
public class ContactDto {
    private final long id;

    private final String phoneNumber;

    private final String email;

    private final String profileLink;
}
