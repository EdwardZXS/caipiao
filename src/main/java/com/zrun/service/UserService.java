package com.zrun.service;

import com.github.pagehelper.PageHelper;
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
        PageHelper.startPage(1,1);
        return userMapper.userList();
    }

    public User getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
