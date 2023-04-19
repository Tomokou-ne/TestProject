package com.example.testproject.service;

import com.example.testproject.dao.UserDaoImpl;
import com.example.testproject.users.User;

public class UserService {

    UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public boolean checkUserExist(User user) {
        User a = userDao.getUserByName(user.getName());
        return a != null;
    }
}
