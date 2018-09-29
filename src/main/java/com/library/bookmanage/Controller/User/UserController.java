package com.library.bookmanage.Controller.User;

import com.library.bookmanage.Service.UserService;
import com.library.bookmanage.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/user")
public class UserController {

    private UserService service;

    @RequestMapping("/find")
    public User findUserByUsername(String name){
        String username = "lgz";
        User user = service.findUserByUsername(username);
        return user;
    }
}
