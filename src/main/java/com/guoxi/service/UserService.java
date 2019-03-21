package com.guoxi.service;

import com.guoxi.entity.User;
import result.CommonResult;

public interface UserService {
    /*    * 通过id获得user数据
     *  * @param  int  id  主键
     *  * @return User user对象
     *  * */
    User getUser(Integer id);
    /*
    * * 检查登陆的账户信息是否匹配，用户名和密码是否存在、正误
    * * @param  string username 用户名
    * * @param  string password 密码
    * * @return bool 正确返回true 否则返回false
    * * */

    CommonResult checkUser(String username, String password);
}
