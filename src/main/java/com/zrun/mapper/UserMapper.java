package com.zrun.mapper;


import com.zrun.common.Result;
import com.zrun.model.User;
import org.apache.ibatis.annotations.Insert;
import com.zrun.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Edward
 */
@Mapper
public interface UserMapper {

    @Select(value = "Select * from user")
    public List<User> userList();

    @Select(value = "Select * from user where id = #{id}")
    public User getUserById(String id);

    @Insert(value = "Insert into user(id,name,age) values(#{id},#{name},#{age})")
    public Result saveUser(User user);
}
