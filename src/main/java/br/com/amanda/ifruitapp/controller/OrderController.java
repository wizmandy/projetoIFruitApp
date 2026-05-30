package br.com.amanda.ifruitapp.controller;

import br.com.amanda.ifruitapp.entity.Order;
import br.com.amanda.ifruitapp.entity.User;
import br.com.amanda.ifruitapp.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @GetMapping("/pedido/{id}")
    public Order retornaPedido(@PathVariable int id){
        return orderService.procuraOrderPorId(id);
    }

    @PostMapping("/novopedido/{id}")
    public Order addPedido(@RequestBody Order orderTarget, @RequestParam int id){
        return orderService.addPedido(orderTarget, id);
    }
}