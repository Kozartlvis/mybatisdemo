package com.kozart.demo.demo.mapper;

import com.kozart.demo.demo.bean.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
*@Description mapper DAO层
*@Param
*@Return
*@Author Kozart
*@Date 2019/7/12
*@Time 11:56
*/
@Repository
public interface UserMapper {

   public User Sel(int id);
//   public User loginInfo(@Param("userName") String userName , @Param("passWord") String passWord);
   public User loginInfo(String userName ,String passWord);
}


