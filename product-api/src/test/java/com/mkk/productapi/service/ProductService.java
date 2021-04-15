package com.mkk.productapi.service;

import com.mkk.productapi.entity.Product;
import com.mkk.productapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Iterable<Product> findAll(){
        return repository.findAll();
    }
}
