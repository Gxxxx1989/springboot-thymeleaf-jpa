package com.guoxi.service.impl;

import com.guoxi.dao.UserRepository;
import com.guoxi.entity.User;
import com.guoxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import result.CommonResult;


import java.util.List;

 

@Service

public class UserServiceImpl implements UserService {

 

 

    private final UserRepository ur ;

 

    @Autowired

    UserServiceImpl(UserRepository ur){

        this.ur = ur;

    }

 

    @Override

    public User getUser(Integer id) {

 

        return null;

    }

 

    @Override

    public CommonResult checkUser(String username, String password) {

        List<User> users = this.ur.findUserByUsernameAndPassword(username,password);

        if(users.isEmpty()){

            return new CommonResult(101,"没有这个用户或者用户名字错误",null);

        }else {

            return new CommonResult(100,"登陆成功",users);

        }

    }

}
