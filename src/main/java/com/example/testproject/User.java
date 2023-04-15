package com.example.testproject;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        if (login.isBlank() || login.isEmpty() || login == null) {
            throw new RuntimeException("Enter login");
        } else {
            this.login = login;
        } if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            throw new RuntimeException();
        }
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
