package com.example.testproject.service;

import com.example.testproject.dao.UserDaoImpl;
import com.example.testproject.users.User;

public class UserService {

    private UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        return userDao.getUserByName(user.getName()) != null;
    }
}
