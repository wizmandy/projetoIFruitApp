package br.com.amanda.ifruitapp.service;

import br.com.amanda.ifruitapp.entity.Product;
import br.com.amanda.ifruitapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Product buscarPorId(Integer id){
        return productRepository.findById(id).orElseThrow();
    }

    public Iterable<Product> retornaTodosProdutos(){
        return productRepository.findAll();
    }

    public Product adicionaProduto(Product product){
        return productRepository.save(product);
    }
}
