package com.zrun.service;

import com.github.pagehelper.PageHelper;
import com.zrun.common.Result;
import com.zrun.mapper.UserMapper;
import com.zrun.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public Result saveUser(User user) {
        return  userMapper.saveUser(user);
    }
}
