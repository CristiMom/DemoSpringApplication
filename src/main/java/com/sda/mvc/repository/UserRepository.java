package com.sda.mvc.repository;


import com.sda.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepository {

    public List<User> userList;
    // create, read, update, delete

    @Autowired
    public UserRepository(List<User> userList) {
        this.userList = userList;
    }

    // create new user - save
    public void save(User user) {
        userList.add(user);
        User user1 = new User(1, "David", "david", "23123", "david@dav.com", 15);
        User user2 = new User(2, "Alex", "alex", "285", "alex@gmail.com", 23);
        User user3 = new User(3, "Paul", "paulica", "28555", "paul@gmail.com", 50);

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }

    //
//    // read
//    public abstract User findUserById(int userId);
//
//    public abstract User findUserByUsername(String username);
//
    public List<User> findAllUsers() {

        return userList;
    }

    public User delete(int index){
        User user = userList.remove(index);
        return user;
    }


}
