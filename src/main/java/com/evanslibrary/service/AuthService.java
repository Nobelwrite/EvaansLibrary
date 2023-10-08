package com.evanslibrary.service;


import com.evanslibrary.dto.SignRequest;
import com.evanslibrary.dto.UserDTO;

public interface AuthService {
    UserDTO createUser(SignRequest signRequest);


}
