package br.com.amanda.ifruitapp.service;

import br.com.amanda.ifruitapp.entity.User;
import br.com.amanda.ifruitapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User buscarPorId(Integer id){
        return userRepository.findById(id).orElseThrow();
    }

    public Iterable<User> retornaTodosUsers(){
        return userRepository.findAll();
    }

    public User adicionaUsuario(User user){
        return userRepository.save(user);
    }
}