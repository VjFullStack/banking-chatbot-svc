package com.banking.chatbot.service;

import com.banking.chatbot.entities.User;
import com.banking.chatbot.repository.UserRepository;
import com.banking.chatbot.usermodel.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserValidationService {
    @Autowired
    private UserRepository userRepository;

    public LoginResponse validateUser(String userName, String password ){
        User storedUser = userRepository.findByUsername(userName);
        if (storedUser != null && storedUser.getPassword().equals(password)) {
            String sessionId = UUID.randomUUID().toString();
            storedUser.setSessionId(sessionId);
            userRepository.save(storedUser);
            return new LoginResponse(sessionId);
        } else {
            return new LoginResponse("InValid User");
        }
    }
}
