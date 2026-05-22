package br.com.amanda.ifruitapp.service;

import br.com.amanda.ifruitapp.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> lista = new ArrayList<>();
    public UserService(){
        this.lista.add(new User(1, "Amanda", "amandagdasilva01@gmail.com", "125.925.099-76"));
        this.lista.add(new User(2, "Maria", "maria@gmail.com", "Não tem cpf"));
        this.lista.add(new User(3, "João", "joao@gmail.com", "145.654.743-23"));
        this.lista.add(new User(4, "Isadora", "isadora@gmail.com", "Não tem cpf"));
        this.lista.add(new User(5, "Nelson", "nelson@gmail.com", "Não tem cpf"));
    }

    public User buscarPorId(int id){
        for (int i = 0; i <= lista.size(); i++){
            System.out.println(this.lista.get(i));
            if (this.lista.get(i).getId() == id){
                return this.lista.get(i);
            }
        }

        return null;
    }
}
