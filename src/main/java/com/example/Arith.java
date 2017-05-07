package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Arith {
    @GetMapping("/square/{id}")
    public String square(@PathVariable Long id){
        return String.valueOf(id*id);
    }
    @GetMapping("/inc/{id}")
    public String inc(@PathVariable Long id){
        return String.valueOf(id+1);
    }
    @GetMapping("/dec/{id}")
    public String  dec(@PathVariable Long id){
        return String.valueOf(id-1);
    }
}