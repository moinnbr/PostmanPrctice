package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
class HelloController {
    @GetMapping
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }

    @PostMapping
    public String greetWithPost(@RequestBody NameRequest nameRequest) {
        return "Hello, " + nameRequest.getName() + "!";
    }
}