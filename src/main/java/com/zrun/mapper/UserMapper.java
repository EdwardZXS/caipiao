package com.zrun.mapper;

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
}
