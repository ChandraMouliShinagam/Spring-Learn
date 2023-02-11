package com.mouli.first.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "auth")
@Data
public class User {

    private String name;
    private String email;
    private String password;
    private String contact;

    public User(String name, String email, String password, String contact) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contact = contact;
    }
}