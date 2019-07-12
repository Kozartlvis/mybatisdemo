package com.kozart.demo.demo.bean;

import java.io.Serializable;

/**
*@Description user
*@Param 
*@Return 
*@Author Kozart
*@Date 2019/7/12
*@Time 11:53
*/
public class User implements Serializable {
    private static final long serialVersionUID = -704713168076738012L;



    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
    private Integer isAdmain;
    public User(){}
    public User(Integer id,String userName,String passWord ,String realName){
        this.id=id;
        this.userName=userName;
        this.passWord=passWord;
        this.realName=realName;
    }
    public Integer getId() {
        return id;
    }
    public Integer getIsAdmain(){
        return isAdmain;
    }

    public void setIsAdmain(Integer isAdmain) {
        this.isAdmain = isAdmain;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
