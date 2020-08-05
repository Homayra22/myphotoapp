package com.example.myphotoapp.repository;


import com.example.myphotoapp.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getuser()
    {
        User user =new User("Homayra","Texas",150);
        return user;
    }
}
