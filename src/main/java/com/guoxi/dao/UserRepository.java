package com.guoxi.dao;

 

import com.guoxi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

 

public interface UserRepository extends JpaRepository<User,Long> {

 

    /**

     * 查询用户名为username,密码为password的用户

     * @param username

     * @param password

     * @return

     */

    List<User> findUserByUsernameAndPassword(String username , String password );

 

 

 

}
