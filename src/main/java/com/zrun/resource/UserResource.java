package com.zrun.resource;

import com.zrun.common.Result;
import com.zrun.model.User;
import com.zrun.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.ws.rs.GET;
import java.util.List;

/**
 * Created by Edward
 */
@Controller

@RequestMapping("/user")
@Api(description = "用户相关接口")
public class UserResource {
    private Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserService userService;

    @GET
    @ApiOperation(value = "根据id获取用户信息",notes = "根据id获取用户信息",httpMethod = "GET",response = User.class)
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@PathVariable @ApiParam(value = "用户ID") String id){
        User user = new User();
        user = userService.getUserById(id);
        return user;
    }

    @RequestMapping("/userList")
    @ApiOperation(value = "获取用户列表",notes = "获取用户列表",httpMethod = "GET",response = List.class)
    @ResponseBody
    public List<User> userList(){
        try {
            return userService.userList();
        }catch (Exception e){
            logger.error("获取用户列表信息失败！",e);
            return null;
        }
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ApiOperation(value = "添加新的用户", notes = "添加新的用户", httpMethod = "POST", response = Result.class)
    @ResponseBody
    public Result saveUser(@ApiParam(value = "新增用户") User user, @ApiParam("") String name,@ApiParam("") String id, @ApiParam("")String age) {
        user.setId(id);
        user.setAge(age);
        user.setName(name);
        Result result = new Result();
        if (StringUtils.isEmpty(user.getId())) {// 如果为空
            result = userService.saveUser(user);
            return result;
        } else {
            result.setData("id已存在,转到更改环节");
            return result;
        }
    }
}
