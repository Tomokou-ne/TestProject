package com.example.testproject;

public class User {
    public String login;
    public String email;

    public User(String login, String email) {
        if (login.isBlank() || login.isEmpty()) {
            throw new RuntimeException("Enter login");
        } else {
            this.login = login;
        } if (email.contains("@") && email.contains(".")) {
            this.email = email;
        } if (email.isBlank() || email.isEmpty()) {
            throw new RuntimeException("Enter email");
        }
    }

    public User() {
    }

    public void loginVerification() {
        if (login.isBlank() || login.isEmpty() || login == null) {
            throw new RuntimeException();
        }
    }
    public boolean emailVerification() {
        if (email.contains("@") && email.contains(".")) {
            return true;
        } if (email.isBlank() || email.isEmpty() || email == null) {
            return false;
        }
        return false;
    }
    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User users = (User) o;
        return login == users.login && email == users.email;
    }
}
