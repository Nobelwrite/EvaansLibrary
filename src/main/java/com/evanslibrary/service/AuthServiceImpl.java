package com.evanslibrary.service;

import com.evanslibrary.dto.AuthRequest;
import com.evanslibrary.dto.SignRequest;
import com.evanslibrary.dto.UserDTO;
import com.evanslibrary.model.User;
import com.evanslibrary.repository.UserRepository;
import com.fasterxml.jackson.databind.introspect.TypeResolutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class AuthServiceImpl implements AuthService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO createUser(SignRequest signRequest) {
        User user = new User();
        user.setFirstName(signRequest.getFirstName());
        user.setLastName(signRequest.getLastName());
        user.setAddress(signRequest.getAddress());
        user.setAge(signRequest.getAge());
        user.setEmail(signRequest.getEmail());
        user.setDob(signRequest.getDob());
        user.setPhoneNumber(signRequest.getPhoneNumber());
        user.setFavorite_word(signRequest.getFavorite_word());
        user.setPassword(signRequest.getPassword());
        User createUser = userRepository.save(user);
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName(createUser.getFirstName());
        userDTO.setLastName(createUser.getLastName());
        userDTO.setDob(createUser.getDob());
        userDTO.setAge(createUser.getAge());
        userDTO.setEmail(signRequest.getEmail());
        userDTO.setAddress(signRequest.getAddress());
        userDTO.setPhoneNumber(signRequest.getPhoneNumber());
        userDTO.setFavorite_word(signRequest.getFavorite_word());
        //userDTO.setPassword(new BCryptPasswordEncoder().encode(signRequest.getPassword()) );
        return userDTO;
    }
    public ResponseEntity<String> login (AuthRequest authRequest) {
        User user = new User();
        user.setEmail(authRequest.getEmail());
        user.setPassword(authRequest.getPassword());
        userRepository.save(user);
        return ResponseEntity.ok("Accepted");
    }
    public ResponseEntity<User>viewProfile(SignRequest signRequest) {
        userRepository.findByEmail(signRequest.getEmail());
        userRepository.findByFirstName(signRequest.getFirstName());
        userRepository.findByPhoneNumber(signRequest.getPhoneNumber());
        userRepository.findByPhoneNumber(signRequest.getPhoneNumber());
        userRepository.findByAge(signRequest.getAge());
        userRepository.findByAddress(signRequest.getAddress());
        userRepository.findByDob(signRequest.getDob());
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
    public ResponseEntity<User> updateUser(@PathVariable Long userId, @RequestBody User users) {
        User user = userRepository.findById(userId);
        if (user != null) {
            if (user.getFirstName() != null) {
                users.setFirstName(users.getFirstName());

            }
            if(user.getLastName() != null){
                users.setLastName(users.getLastName());
            }
            if (user.getAddress() != null) {
                users.setAddress(users.getAddress());
            }
            if (user.getAge() != null) {
                users.setAddress(users.getAddress());
            }
            if (user.getEmail() != null) {
                users.setEmail(users.getEmail());
            }
            userRepository.save(users);
        }
        return ResponseEntity.ok(users1);
    }
}
