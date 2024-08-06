package com.example.product_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseMessage getAllProducts() {
        List<Product> p = productService.getAllProducts();
        return new ResponseMessage(201,"Success", true, p);
    }

    @GetMapping("/{id}")
    public ResponseMessage getProductById(@PathVariable Long id) {
        Product p= productService.getProductById(id);
        return new ResponseMessage(201,"Success", true, p);
    }

    @PostMapping
    public ResponseMessage createProduct(@RequestBody Product product) {
        Product p = productService.saveProduct(product);
        return new ResponseMessage(201,"Success", true, p);
    }

    @DeleteMapping("/{id}")
    public ResponseMessage deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
        return new ResponseMessage(201,"Success", true, null);
    }
}
