package com.example.tp1.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {


    @RequestMapping("/helloSpring")
    public String sayHello(){
        return "Hello world !";
    }
}
