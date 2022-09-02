package com.interfacetest.interfacetest2.service;

import com.interfacetest.interfacetest2.entity.Users;
import org.springframework.transaction.annotation.Transactional;

public interface UsersService {
    public void addUser(Users users);

    public void addUser2(Users users);
}
