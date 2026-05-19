package com.contatodireto.demo.controller;

import com.contatodireto.demo.service.Service.UserService;
import org.springframework.web.bind.annotation.*;
import com.contatodireto.demo.model.Model.User;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {


    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }


    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }


    @GetMapping("/{id}")
    public  User findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }

    @DeleteMapping( "/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }
}
