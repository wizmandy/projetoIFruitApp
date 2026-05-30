package br.com.amanda.ifruitapp.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tbl_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double preco;
    @ManyToOne
    private User user;
    public Order(){}

    public Order(Integer id, Double preco, User user) {
        this.id = id;
        this.preco = preco;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order order)) return false;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", preco=" + preco +
                ", user=" + user +
                '}';
    }
}