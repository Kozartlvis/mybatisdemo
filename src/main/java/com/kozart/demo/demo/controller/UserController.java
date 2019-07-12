package com.kozart.demo.demo.controller;




import com.kozart.demo.demo.bean.User;
import com.kozart.demo.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
*@Description 2
*@Param
*@Return
*@Author Kozart
*@Date 2019/7/12
*@Time 11:51
*/

@Controller
@RequestMapping("/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();

    }
    @RequestMapping("getUserJson/{id}")
    public User GetJson(@PathVariable int id){
        return userService.Sel(id);

    }
//    @RequestMapping(value = "/manage")
//    public ModelAndView test(ModelAndView mv) {
//        mv.setViewName("/manage");
//        mv.addObject("title","欢迎使用Thymeleaf!");
//        return mv;
//    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/getLogin")
    public String getLogin(User user, Map<String,Object> map, Model model) {
        User user1 = userService.loginInfo(user.getUserName(), user.getPassWord());
        System.out.println(user1);
        if (user1 == null) {
            map.put("msg", "username or password are wrong!");
            return "error";
        } else if(user1.getIsAdmain()==1){
            map.put("msg", "admin login success!");
            model.addAttribute("title",user.getUserName()+" login success!");
            return "/manage";
        }
        else{
            map.put("msg", user.getUserName()+"login success!");
            return "success";
        }

    }
    @RequestMapping("/insertInfo")
    public String insertInfo(User user) {
        User user1 = userService.loginInfo(user.getUserName(), user.getPassWord());
        System.out.println(user1);
        if (user1 == null) {
            map.put("msg", "username or password are wrong!");
            return "error";
        } else if(user1.getIsAdmain()==1){
            map.put("msg", "admin login success!");
            model.addAttribute("title",user.getUserName()+" login success!");
            return "/manage";
        }
        else{
            map.put("msg", user.getUserName()+"login success!");
            return "success";
        }

    }
//普通获取参数
//    @RequestMapping("/getLogin")
//    @ResponseBody
//    public String getLogin(@RequestParam(value = "userName") String userName, @RequestParam(value="passWord") String passWord){
//        User user1=userService.loginInfo(userName,passWord);
//        System.out.println(user1);
//        if(user1==null){
////            map.put("msg","username of password are wrong!");
//            return user1.toString();
//        }else{
////            map.put("msg","login success!");
//            return "success";
//        }
//
//
//    }


}

