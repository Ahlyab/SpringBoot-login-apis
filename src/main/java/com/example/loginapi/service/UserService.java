package com.example.loginapi.service;

import com.example.loginapi.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class UserService {
    public static final String EXISTING_EMAIL = "test@test.com";
    public Optional<UserEntity> findByEmail(String email) {
        // Todo: move this to database

        if(! EXISTING_EMAIL.equalsIgnoreCase(email)) return Optional.empty();

        var user = new UserEntity();
        user.setId(1L);
        user.setEmail(EXISTING_EMAIL);
        user.setPassword("$2a$12$ukgLiKa/JqcgRzlUGBJ4ReIbk92ipa9YkZrw/C0SY985lTQ4bs5z2");
        user.setRole("ROLE_ADMIN");
        user.setExtraInfo("something");

        return Optional.of(user);
    }
}
