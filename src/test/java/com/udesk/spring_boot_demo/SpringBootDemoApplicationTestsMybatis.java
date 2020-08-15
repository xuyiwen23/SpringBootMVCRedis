package com.udesk.spring_boot_demo;

import com.udesk.spring_boot_demo.entity.User;
import com.udesk.spring_boot_demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBootDemoApplicationTestsMybatis {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void  testUpdateUsers(){
        User user1 = new User();
        user1.setName("李磊");
        user1.setGender(1);

//        user1.setId(1);
//        Integer integer = userMapper.updateUserById(user1);

        User user2 = new User();
        user2.setName("cc");
        user2.setGender(1);

        List userList = new ArrayList();
        userList.add(user1);
        userList.add(user2);
        Integer integer = userMapper.updateUsers(userList);
        System.out.println(integer);
    }

//    @Test
//    void contextLoads() {
//    }

}
