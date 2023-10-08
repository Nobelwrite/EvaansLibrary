package com.evanslibrary.dto;

import com.evanslibrary.model.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class SignRequest {

    private String firstName;


    private String lastName;


    private String email;


    private int age;


    private String phoneNumber;


    private String address;


    private String dob;


    private String favorite_word;


    private String password;

    private Role role;



}
