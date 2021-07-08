package com.sda.mvc.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity (name = "users")
public class User {

    @Id
    @GeneratedValue()
    private Integer id;
    private String name;
    private String username;
    private String password;
    private String email;
    private int age;

}
