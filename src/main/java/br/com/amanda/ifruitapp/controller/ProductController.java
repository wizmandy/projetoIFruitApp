package br.com.amanda.ifruitapp.controller;

import br.com.amanda.ifruitapp.entity.Product;
import br.com.amanda.ifruitapp.repository.ProductRepository;
import br.com.amanda.ifruitapp.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    ProductService productService;
    ProductRepository productRepository;

    public ProductController(ProductService productService, ProductRepository productRepository) {
        this.productService = productService;
        this.productRepository = productRepository;
    }

    @GetMapping("/product/{id}")
    public Product retornaProdutoPorId(@PathVariable int id) {
        return productService.buscarPorId(id);
    }

    @GetMapping("/product/listartodos")
    public Iterable<Product> retornaTodosProducts(){
        return productService.retornaTodosProdutos();
    }

    @PostMapping("/addproduct")
    public Product adicionaProduct(@RequestBody Product productTarget) {
        return productService.adicionaProduto(productTarget);
    }
}