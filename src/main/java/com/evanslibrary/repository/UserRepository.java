package com.evanslibrary.repository;

import com.evanslibrary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface
UserRepository extends JpaRepository<User, Integer> {
   List<User>findAll();

    Optional<User> findById(int id);
    Optional<User>findByFirstName(String firstName);
    Optional<User>findByLastName(String lastName);
    Optional<User>findByFirstAndLastName(String firstName, String lastName);
    Optional<User>findByEmail(String email);
    Optional<User>deleteById(int id);
    Optional<User>findByPhoneNumber(String phoneNumber);

 Optional<User> findByAge(int age);
 Optional<User>findByDob(String dob);

 Optional<User> findByAddress(String address);

 User findById(Long userId);
}
