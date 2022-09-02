package com.interfacetest.interfacetest2.service.impl;

import com.interfacetest.interfacetest2.dao.UsersDao;
import com.interfacetest.interfacetest2.entity.Users;
import com.interfacetest.interfacetest2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersDao usersDao;

    @Override
    @Transactional
    public void addUser(Users users) {
        this.usersDao.insertUsers(users);
    }

    @Override
    @Transactional
    public void addUser2(Users users) {
        this.usersDao.insertUsers2(users);
    }
}
