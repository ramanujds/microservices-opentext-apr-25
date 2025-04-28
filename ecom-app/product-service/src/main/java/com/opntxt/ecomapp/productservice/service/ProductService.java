package com.opntxt.ecomapp.productservice.service;

import com.opntxt.ecomapp.productservice.model.Product;
import com.opntxt.ecomapp.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private ProductRepository productRepo;

    public ProductService(ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    public Product saveProduct(Product product) {
        return productRepo.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Product getProductById(long id) {
        return productRepo.findById(id).orElseThrow(()-> new RuntimeException("Product not found"));
    }

    public void deleteProductById(long id) {
        productRepo.deleteById(id);
    }

    public Product getProductByName(String name) {
        return productRepo.findByName(name).orElseThrow(()-> new RuntimeException("Product not found"));
    }



}
