package com.hello.world.endpoint.rest.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorldController {
    
    @GetMapping("/hello")
    public String helloWorldWithDuckPage() {
        return "hello_world";
    }
}
