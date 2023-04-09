package com.banking.chatbot.api;

import com.banking.chatbot.usermodel.LoginResponse;
import com.banking.chatbot.usermodel.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class LoginController {

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody User user) {
        // Implement login logic here
        String sessionId = generateSessionId();
        boolean isValidUser = validateUser(user);
        if (isValidUser) {
            return ResponseEntity.ok(new LoginResponse(sessionId));
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    private String generateSessionId() {
        // Implement session ID generation logic here
        return UUID.randomUUID().toString();
    }

    private boolean validateUser(User user) {
        // Implement user validation logic here

        return user.getUsername().equals("valid_username") && user.getPassword().equals("valid_password");
    }
}
