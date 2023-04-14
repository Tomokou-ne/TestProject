package com.example.testproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    User user = new User("capybara", "capybara@gmail.com");
    User userTest = new User();
    User sameUser = new User("axolotl@gmail", "axolotl@gmail");

    @BeforeAll
    static void runTest() {
        System.out.println("Test is under the maintenance");
    }

    @Test
    void shouldGetLogin() {
        System.out.println(user.getLogin());
    }
    @Test
    void shouldGetEmail() {
        System.out.println(user.getEmail());
    }
    @Test
    @DisplayName("check correct data from object with data")
    void checkDataIsCorrect() {
        Assertions.assertNotNull(user.getLogin());
        Assertions.assertNotNull(user.getEmail());
    }
    @Test
    @DisplayName("data withdrawal check")
    void checkDataIsNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            userTest.loginVerification();
            userTest.emailVerification();
        });
    }
    @Test
    @DisplayName("check email by signs @ and .")
    void checkCorrectEmail() {
        Assertions.assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }
    @Test
    @DisplayName("try to receive exception")
    void checkWrongEmail() {
        Assertions.assertThrows(NullPointerException.class, () -> sameUser.emailVerification());
    }
    @Test
    @DisplayName("check if login and email are the same")
    void checkIfLoginAndEmailIsEquals() {
        Assertions.assertNotEquals(user.getLogin(), user.getEmail());
        //Assertions.assertThrows(IndexOutOfBoundsException.class, () -> sameUser.equals(sameUser));
    }
}
