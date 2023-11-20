package org.example.service;


import org.example.entity.Product;

import org.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productrepo;

    public List<Product> getAllProducts() {
        return productrepo.findAll();
    }

    public Product saveProduct(Product product) {
        return productrepo.save(product);
    }
}


