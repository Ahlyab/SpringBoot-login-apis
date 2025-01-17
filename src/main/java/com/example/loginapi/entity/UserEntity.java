package com.example.loginapi.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserEntity {
    private  Long id;
    private String email;
    @JsonIgnore
    private String password;
    private String role;
    private String extraInfo;
}
