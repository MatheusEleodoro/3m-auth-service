package com.threembank.interfaces.dto;

import com.threembank.domain.valueobject.Role;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Requisição para cadastro de um novo usuário no banco digital")
public class RegisterUserRequest {

    @NotEmpty
    @NotNull
    @Schema(description = "User's first name", example = "Matheus")
    private String firstName;

    @NotEmpty
    @NotNull
    @Schema(description = "User's last name", example = "Eleodoro")
    private String lastName;

    @NotEmpty
    @NotNull
    @Schema(description = "User's email address", example = "matheus@email.com")
    private String email;

    @NotEmpty
    @NotNull
    @Schema(description = "User password", example = "SenhaSegura123")
    private String password;

    @NotNull
    @Schema(description = "Has the user enabled two-factor authentication?", example = "true")
    private Boolean twoFactorEnabled;

    @NotEmpty
    @NotNull
    @Schema(description = "User permission")
    Set<Role> roles;

}