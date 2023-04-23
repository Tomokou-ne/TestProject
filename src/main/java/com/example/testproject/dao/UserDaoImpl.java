package com.example.testproject.dao;

import com.example.testproject.users.User;

import java.util.*;

public class UserDaoImpl{

    User one = new User("Marina", "ChallisVSmetane");
    User two = new User("Pavel", "Privily227");
    User three = new User("Nikolas", "Bless_You");
    User four = new User("Ignat", "ChemicalBirnOut");

    public List<User> users =List.of(
            one, two, three, four
    );


    public User getUserByName(String name) {
        return users.stream().filter(user -> name.equals(user.getName()))
                .findAny()
                .orElse(null);
    }

    public Collection<User> findAllUsers() {
        return users;
    }
}
