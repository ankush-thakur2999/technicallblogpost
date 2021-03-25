package com.upgrad.com.techicalblogpost.controller;

import com.upgrad.com.techicalblogpost.model.User;
import com.upgrad.com.techicalblogpost.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class UserController {
    private  UserService userService = new UserService();
    @RequestMapping("users/login") //localhost:8080/users/login : GET
    public String login(Model model){
        model.addAttribute("user", new User());
        return "users/login";
    }
    @RequestMapping(value ="users/login" ,method = RequestMethod.POST)
    public String userLogin(User user){
        System.out.print("kdnjnsdkj00000000000000000000000000");
        if(userService.login(user)){
            System.out.print("kdnjnsdkj");
            return "redirect:/posts";
        }
        else
            System.out.print("akfjkankj");
            return "users/login";
    }
}
