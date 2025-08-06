package dev.giridharanks.springproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/h")
    public String Greeting(){
        return "hello world";
    }
}
