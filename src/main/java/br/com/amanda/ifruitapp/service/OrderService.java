package br.com.amanda.ifruitapp.service;

import br.com.amanda.ifruitapp.entity.Order;
import br.com.amanda.ifruitapp.entity.User;
import br.com.amanda.ifruitapp.repository.OrderRepository;
import br.com.amanda.ifruitapp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    UserRepository userRepository;
    OrderRepository orderRepository;

    public OrderService(UserRepository userRepository, OrderRepository orderRepository){
        this.userRepository = userRepository;
        this.orderRepository = orderRepository;
    }
    public Order addPedido(Order order, Integer idUser){
        // Buscar Usuário pelo ID
        if (idUser != null){
            User user = userRepository.findById(idUser).orElseThrow();
            // Construir Order com o Usuário
            order.setUser(user);
            // Validar e Salvar a Order
            return orderRepository.save(order);
        }else{
            return null;
        }
    }

    public Order procuraOrderPorId(int id){
        return orderRepository.findById(id).orElseThrow();
    }
}