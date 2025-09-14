package com.example.project1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/sayhello")
    public String sayHello() {
        return "Hello world!";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome User!";
    }
}