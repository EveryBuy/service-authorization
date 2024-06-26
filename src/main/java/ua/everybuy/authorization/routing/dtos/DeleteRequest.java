package ua.everybuy.authorization.routing.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteRequest {
    @NotNull
    @Pattern(message = "code should be valid (4 numbers)", regexp = "^\\d{4}$")
    String code;
    @NotNull
    String password;
}
