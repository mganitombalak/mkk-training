package com.mkk.productapi.controller;

import com.mkk.productapi.entity.Product;
import com.mkk.productapi.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Product> findAll(){
        return service.findAll();
    }
}
