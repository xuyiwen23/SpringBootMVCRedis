package com.udesk.spring_boot_demo.mapper;

import com.udesk.spring_boot_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    public List<User> selectAll() ;

    public Integer updateUsers(List userList);

    Integer updateUserById(User user);

    @Select("select * from users where id = #{id}")
    User selectOne(Integer id);
}
