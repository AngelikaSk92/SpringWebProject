package com.angelika.AkademiaProgramowania.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by &[User] and &[Date].
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "helloworld.html";
    }

}
