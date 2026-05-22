package br.com.amanda.ifruitapp.controller;

import br.com.amanda.ifruitapp.entity.User;
import br.com.amanda.ifruitapp.repository.UserRepository;
import br.com.amanda.ifruitapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    UserService userService;
    UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }
    @GetMapping("/user/{id}")
    public User retornaUsuarioPorId(@PathVariable int id){
        return userService.buscarPorId(id);
    }

    @PostMapping("/adduser")
    public User adicionaUsuario(@RequestBody User userTarget){
        return userRepository.save(userTarget);
    }
}