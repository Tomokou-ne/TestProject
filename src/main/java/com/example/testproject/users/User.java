package com.example.testproject.users;

public class User {

    public String name;
    public String login;

    public User(String name, String login) {
        this.name = name;
        this.login = login;
    }

    public User(){}

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return name + " " + login;
    }
}
