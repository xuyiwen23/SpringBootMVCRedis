package com.udesk.spring_boot_demo.service;

import com.udesk.spring_boot_demo.entity.User;
import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User findOneUser(Integer id) throws Exception;
}
