package com.evanslibrary.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_management")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "first-name")
    private String firstName;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "last-name")
    private String lastName;

    @NotBlank
    @NotBlank
    @NotNull
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @NotEmpty
    @NotBlank
    @Column(name = "age")
    private int age;

    @NotEmpty
    @NotBlank
    @NotNull
    @Column(name = "phone-number")
    private String phoneNumber;

    @NotEmpty
    @NotBlank
    @NotNull
    @Column(name = "address")
    private String address;

    @NotEmpty
    @NotBlank
    @NotNull
    @Column(name = "date of birth")
    private String dob;

    @NotEmpty
    @NotBlank
    @NotNull
    @Column(name = "favorite-word")
    private String favorite_word;


    @NotNull
    @NotEmpty
    @NotBlank
    @Length(min = 6, message = "Your passowrd can't be less than 6 characters or long thant 12", max = 12)
    @Pattern(regexp = "(?=.^*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,15}")
    private String password;
    @Enumerated(value = EnumType.STRING)
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFavorite_word() {
        return favorite_word;
    }

    public void setFavorite_word(String favorite_word) {
        this.favorite_word = favorite_word;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = Role.valueOf(role);
    }
}
