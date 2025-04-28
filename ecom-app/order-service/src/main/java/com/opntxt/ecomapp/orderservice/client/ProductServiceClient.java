package com.opntxt.ecomapp.orderservice.client;

import com.opntxt.ecomapp.orderservice.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service")
public interface ProductServiceClient {

    @GetMapping("/api/v1/products/{id}")
    public ProductDto getProductById(@PathVariable long id);


}
