package com.evanslibrary.controller;

import com.evanslibrary.dto.AuthRequest;
import com.evanslibrary.dto.SignRequest;
import com.evanslibrary.dto.UserDTO;
import com.evanslibrary.model.User;
import com.evanslibrary.service.AuthService;
import com.evanslibrary.service.AuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/library-user/")
public class UserController {
    @Autowired
    private AuthServiceImpl authServiceImpl;

    @PostMapping("/register")
    public ResponseEntity<?>createUser(@RequestBody SignRequest signRequest){
        UserDTO userDTO = authServiceImpl.createUser(signRequest);
        if(userDTO == null)
            return new ResponseEntity<>("User not created, check your details and try again.", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public  ResponseEntity<String>login(@RequestBody AuthRequest authRequest) {
        return authServiceImpl.login(authRequest);
    }

    @GetMapping("/profile")
    public ResponseEntity<User>viewProfile(SignRequest signRequest){
        return authServiceImpl.viewProfile(signRequest);
    }
    @PutMapping("/update")
    public ResponseEntity<User>update(S)


}
