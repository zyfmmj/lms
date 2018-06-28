package com.peppa.yec.demo.service.imp;

import com.peppa.yec.demo.mapper.UserMapper;
import com.peppa.yec.demo.service.UserService;
import com.peppa.yec.demo.util.Errors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zyf
 */
@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String login(String username, String password) {
        Integer isExists = userMapper.selectExistsUserName(username);
        if(isExists == 0){
            return Errors.USER_NOT_EXISTS_ERROR;
        }else {
            return userMapper.selectByUser(username, password);
        }
    }
}
