package com.example.hostela.service;

import com.example.hostela.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    UserDto saveUser(UserDto user);
    UserDto updateUser(Integer userid, UserDto user);

    boolean userEmailExist(String email);
    boolean userPhoneNumberExist(String phoneNumber);

    UserDto authenticate(String username, String password);


    List<UserDto> getAllUsers();
}
