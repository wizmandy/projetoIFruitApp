package br.com.amanda.ifruitapp.repository;

import br.com.amanda.ifruitapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
