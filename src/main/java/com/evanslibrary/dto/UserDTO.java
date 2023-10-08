package com.evanslibrary.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserDTO {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private int age;

    private String phoneNumber;

    private String address;

     private String dob;

    private String favorite_word;

    private String password;

}
