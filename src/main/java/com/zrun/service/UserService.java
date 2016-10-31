package com.zrun.service;

import com.zrun.mapper.UserMapper;
import com.zrun.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Edward
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> userList(){
        return userMapper.userList();
    }
}
