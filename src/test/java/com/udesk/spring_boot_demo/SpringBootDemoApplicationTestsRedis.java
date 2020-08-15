package com.udesk.spring_boot_demo;

import com.udesk.spring_boot_demo.Util.Map2Object;
import com.udesk.spring_boot_demo.entity.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.*;

@SpringBootTest
class SpringBootDemoApplicationTestsRedis {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public  void testString(){
        stringRedisTemplate.opsForValue().set("Stringuser","Stringuserss");
        String user = stringRedisTemplate.opsForValue().get("Stringuser");

        Integer append = stringRedisTemplate.opsForValue().append("Stringuser", "append");
        System.out.println(append);

        Long size = stringRedisTemplate.opsForValue().size("Stringuser");
        System.out.println(size);

        List<String> strings = stringRedisTemplate.opsForValue().multiGet(Arrays.asList("1", "10", "12"));
        System.out.println(strings);

        String stringuser = stringRedisTemplate.opsForValue().get("Stringuser", 0, 3);
        System.out.println(stringuser);
    }

    @Test
    public void  testList(){
//        List list = new ArrayList();
//        list.add(new User(0,"user1",0));
//        list.add(new User(1,"user2",10));
//        list.add(new User(2,"user3",20));
//        list.add(new User(3,"user4",30));
//        list.add(new User(4,"user5",40));
//        redisTemplate.opsForList().rightPushAll("listUser",list);
//
//        Long aLong = redisTemplate.opsForList().rightPush("listUser", new User(7, "user7", 70));
//        System.out.println(aLong);
//
//        List listUser = redisTemplate.opsForList().range("listUser", 0, -1);
//        System.out.println(listUser);
//
//        Long listUser1 = redisTemplate.opsForList().size("listUser");
//        System.out.println(listUser1);

        Object listUser2 = redisTemplate.opsForList().index("listUser", 1);
        System.out.println(listUser2);

//        Long listUser3 = redisTemplate.opsForList().remove("listUser", 0,new User(4,"user5",40));
//        System.out.println(listUser3);
//
//        redisTemplate.opsForList().trim("listUser",2,5);
//        List listUser5 = redisTemplate.opsForList().range("listUser", 0, -1);
//        System.out.println(listUser5);
    }

    @Test
    public void testHash() throws Exception {
//        HashMap<String,User> hashMap = new HashMap<>();
//        hashMap.put("User1",new User(0,"user1",0));
//        hashMap.put("User2",new User(1,"user2",10));
//        hashMap.put("User3",new User(2,"user3",20));
//        redisTemplate.opsForHash().putAll("hashUser",hashMap);
//        Map entries = redisTemplate.opsForHash().entries("hashUser");
//        entries.forEach((k,v) -> System.out.println(k +" "+v+"|"));
//
//        Boolean aBoolean = redisTemplate.opsForHash().hasKey("hashUser", "User5");
//        System.out.println(aBoolean);
//
//        Long delete = redisTemplate.opsForHash().delete("hashUser", "User2");
//        System.out.println(delete);

        Object user3 = redisTemplate.opsForHash().get("hashUser", "User3");
        System.out.println(user3);
        HashMap hash3 = (LinkedHashMap)user3;
        Object object = Map2Object.mapToObject(hash3, User.class);
        System.out.println((User)object);

//        Set hashuser = redisTemplate.opsForHash().keys("hashUser");
//        System.out.println(hashuser);
//
//        List hashUser = redisTemplate.opsForHash().values("hashUser");
//        System.out.println(hashUser);
//
//        Boolean hashUser1 = redisTemplate.hasKey("hashUser");
//        System.out.println(hashUser1);
    }

    @Test
    public void testSet(){
        User u1 = new User(0,"user1",0);
        User u2 = new User(1,"user2",10);
        User u3 = new User(2,"user3",20);

        Long add = redisTemplate.opsForSet().add("setUser",u1,u2,u3);
        System.out.println(add);

        Set setUser = redisTemplate.opsForSet().members("setUser");
        System.out.println(setUser);

        Boolean setuser = redisTemplate.opsForSet().isMember("setUser", u3);
        System.out.println(setuser);

        Long size = redisTemplate.opsForSet().size("setUser");
        System.out.println(size);

        Long setUser1 = redisTemplate.opsForSet().remove("setUser", u3);
        System.out.println(setUser1);

        User u4 = new User(0,"user4",0);
        User u5 = new User(1,"user5",10);
        User u6 = new User(2,"user6",20);
        redisTemplate.opsForSet().add("setUser2",u4,u4,u6);

        Boolean move = redisTemplate.opsForSet().move("setUser", u3, "setUser2");
        System.out.println(move);

        Set difference = redisTemplate.opsForSet().difference("setUser", "setUser2");
        System.out.println(difference);

        Set intersect = redisTemplate.opsForSet().intersect("setUser", "setUser2");
        System.out.println(intersect);

        Set union = redisTemplate.opsForSet().union("setUser", "setUser2");
        System.out.println(union);

        Set m1 = redisTemplate.opsForSet().members("setUser");
        System.out.println(m1);
        Set m2 = redisTemplate.opsForSet().members("setUser2");
        System.out.println(m2);
    }

}
