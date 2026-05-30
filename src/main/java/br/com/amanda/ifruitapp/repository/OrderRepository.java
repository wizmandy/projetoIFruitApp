package br.com.amanda.ifruitapp.repository;

import br.com.amanda.ifruitapp.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Integer> {
}