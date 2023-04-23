package com.example.testproject.service;

import com.example.testproject.dao.UserDaoImpl;
import com.example.testproject.service.UserService;
import com.example.testproject.users.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.FileNotFoundException;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {


    @Mock
    UserDaoImpl userDao;
    @InjectMocks
    UserService userService;

    public UserServiceTest() {
        MockitoAnnotations.initMocks(this);
        this.userService = new UserService(userDao);
    }

    User userOne = new User("Nikolas", "Bless_You");
    User userNotExist = new User("Katya", "LoL4ever");

    @Test
    void checkIfUserExistsTrue() {
        when(userDao.getUserByName("Nikolas"))
                .thenReturn(userOne);
        boolean userExists = userService.checkUserExist(userOne);
        Assertions.assertTrue(userExists);
        verify(userDao).getUserByName("Nikolas");

    }

    @Test
    void checkIfUserDoNotExist() {
        when(userDao.getUserByName("Katya"))
                .thenReturn(null);
        boolean userDoNotExist = userService.checkUserExist(userNotExist);
        Assertions.assertFalse(userDoNotExist);
    }
}
