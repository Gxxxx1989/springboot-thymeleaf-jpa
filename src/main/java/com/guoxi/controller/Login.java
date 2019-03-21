package com.guoxi.controller;


import com.guoxi.entity.User;
import com.guoxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import result.CommonResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

 

@Controller

//@RestController

public class Login {

 

    @Autowired

    private UserService usi;

 

    /*

    * 登陆页面

    *

    * */

    @RequestMapping("/login")

    public String login(Map<String,Object> map){

 

        map.put("test","123456");

        map.put("userinfo" ,new User("lili","123456",22));

 

        List<User> list = new ArrayList<>();

 

        for (int i=0 ; i<=5; i++){

            User u = new User("lili","123456",(22+i) );

            list.add(u);

        }

        map.put("userlist",list);
        return "login/login";

    }

 

    @RequestMapping("/dologin")

    @ResponseBody

    public Object dologin(User user){

        System.out.printf(user.toString());

        CommonResult cr =  usi.checkUser(user.getUsername(),user.getPassword());

        return cr;

    }

 

 

 

 

}
