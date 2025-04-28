package com.opntxt.ecomapp.productservice.service;

import com.opntxt.ecomapp.productservice.model.Product;
import com.opntxt.ecomapp.productservice.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @Mock
    private ProductRepository productRepo;

    @InjectMocks
    private ProductService productService;

    @Test
    void saveProduct() {

        // Given
        Product product = new Product();
        product.setName("iPhone 15");
        product.setPrice(100000.00);
        product.setId(1);
        product.setDescription("The latest iPhone with a new A14 chip and 128GB storage");

        // When
        Mockito.when(productRepo.save(product)).thenReturn(product);
        // Then
        assertEquals(product, productService.saveProduct(product));
        // Verify
        Mockito.verify(productRepo, Mockito.times(1)).save(product);

    }
}