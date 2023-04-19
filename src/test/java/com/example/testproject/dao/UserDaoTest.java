package com.example.testproject.dao;

import com.example.testproject.dao.UserDaoImpl;
import com.example.testproject.users.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest{

    UserDaoImpl userDaoImpl = new UserDaoImpl();
    User user = new User("Nikolas", "Bless_You");
    User empty = new User();

    @Test
    public void userByNameExists() {
        String found = userDaoImpl.getUserByName(user.getName()).toString();
        Assertions.assertNotNull(user);
        Assertions.assertEquals(found, user.toString());
    }

    @Test
    public void checkIfUsedDoNotExistsInList() {
        Assertions.assertNull(empty.getName());
        Assertions.assertNull(empty.getLogin());
        Assertions.assertNotEquals(userDaoImpl.getUserByName(user.getName()), empty);
    }

    //only for check list
    @Test
    public void checkIfClassIsNull() {
        Assertions.assertNotNull(userDaoImpl.users);
    }
}

