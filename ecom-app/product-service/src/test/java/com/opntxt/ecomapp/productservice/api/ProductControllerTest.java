package com.opntxt.ecomapp.productservice.api;

import com.opntxt.ecomapp.productservice.model.Product;
import com.opntxt.ecomapp.productservice.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private ProductService productService;


    @Test
    void getAllProducts() throws Exception {

        // Given
        Product product1 = new Product();
        product1.setName("iPhone 15");
        product1.setPrice(100000.00);
        product1.setId(1);
        product1.setDescription("The latest iPhone with a new A14 chip and 128GB storage");

        Product product2 = new Product();
        product1.setName("Macbook Air");
        product1.setPrice(120000.00);
        product1.setId(2);
        product1.setDescription("The best Macbook Air for 2022");

        // When
        Mockito.when(productService.getAllProducts()).thenReturn(List.of(product1, product2));

        // Then


        mockMvc.perform(get("/api/v1/products"))
                .andExpect(status().isOk());


    }
}