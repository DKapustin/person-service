package liga.medical.personservice.core.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDto {
    private final long id;

    private final String login;

    private final String password;

    private final Set<RoleDto> roles;
}
