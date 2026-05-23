package br.com.amanda.ifruitapp.repository;

import br.com.amanda.ifruitapp.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}