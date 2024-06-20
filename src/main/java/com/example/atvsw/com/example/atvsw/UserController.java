package com.example.atvsw.com.example.atvsw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.atvsw.user;

 
@RestController
@RequestMapping(value ="/users")
public class UserController {
    
    @Autowired
    private UserRepository repository;
   
    @GetMapping
    public List<user> findALL() {
        List<user> result = repository.findAll();
        return result;

    }


}