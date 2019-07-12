package com.kozart.demo.demo.service;
import com.kozart.demo.demo.bean.User;
import com.kozart.demo.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
*@Description userservice
*@Param 
*@Return 
*@Author Kozart
*@Date 2019/7/12
*@Time 11:54
*/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public  User loginInfo(String userName ,String passWord){

        System.out.println(userName+" "+passWord);
        return userMapper.loginInfo(userName,passWord);
    }

}
