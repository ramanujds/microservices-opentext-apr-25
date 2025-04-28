package com.opntxt.ecomapp.productservice.repository;

import com.opntxt.ecomapp.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findByName(String name);

}
