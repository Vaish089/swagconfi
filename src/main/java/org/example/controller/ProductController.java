package org.example.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.example.entity.Product;
import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@Api(tags = "Product API")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    @ApiOperation("Get all products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/hi")
    @ApiOperation("Add a new product")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}