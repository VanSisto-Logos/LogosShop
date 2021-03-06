package com.vansisto.logosshop.domain;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserDTO {
    private Long id;
    @NotNull(message = "Email cannot be null")
    @Email
    private String email;
    @NotNull
    @NotBlank
    private String password;
    private String firstName;
    private String lastName;
}
