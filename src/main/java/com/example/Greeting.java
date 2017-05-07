package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Greeting {

    @GetMapping("/{name}")
    public String square(@PathVariable String name) {
        return "Welcome:" + name;
    }
}