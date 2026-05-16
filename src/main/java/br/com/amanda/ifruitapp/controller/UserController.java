package br.com.amanda.ifruitapp.controller;

import br.com.amanda.ifruitapp.entity.User;
import br.com.amanda.ifruitapp.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping("/user/{id}")
    public User retornaUsuarioPorId(@PathVariable int id){
        return userService.buscarPorId(id);
        }
    }