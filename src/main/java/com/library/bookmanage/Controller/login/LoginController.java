package com.library.bookmanage.Controller.login;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.library.bookmanage.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class LoginController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public void login (@RequestParam(value = "username",required = false) String username, @RequestParam(value = "password",required = false) String password, HttpServletRequest request){

        mongoTemplate.find(new Query(),String.class,username);
        request.getServletContext();
        System.out.println(username);
        System.out.println(password);

        Query query = new Query();

    }

}


