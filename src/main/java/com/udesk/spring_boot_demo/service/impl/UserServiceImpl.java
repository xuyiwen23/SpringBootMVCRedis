package com.udesk.spring_boot_demo.service.impl;

import com.udesk.spring_boot_demo.Util.Map2Object;
import com.udesk.spring_boot_demo.entity.User;
import com.udesk.spring_boot_demo.mapper.UserMapper;
import com.udesk.spring_boot_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public List<User> findAllUsers() {
        List<User> users =  userMapper.selectAll();
        return users;
    }

    @Override
    public User findOneUser(Integer id) throws Exception {
        Object hashUser = redisTemplate.opsForHash().get("hashUser", String.valueOf(id));
        if (hashUser!=null){
            return (User) Map2Object.mapToObject((LinkedHashMap)hashUser, User.class);
        }
        User user = userMapper.selectOne(id);
        redisTemplate.opsForHash().put("hashUser",String.valueOf(id),user);
        redisTemplate.boundHashOps("hashUser").expire(1000, TimeUnit.SECONDS);
        return user;
    }

    public Integer updateUsers(List userList){
        Integer integer = userMapper.updateUsers(userList);
        return  integer;
    }

    public Integer updateUserById(User user){
        Integer integer = userMapper.updateUserById(user);
        return  integer;
    }
}
