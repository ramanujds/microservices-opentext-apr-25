package com.opntxt.ecomapp.orderservice.client;

import com.opntxt.ecomapp.orderservice.dto.ProductDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("product-service")
public interface ProductServiceClient {

    @GetMapping("/api/v1/products/{id}")
    @CircuitBreaker(name = "productClient", fallbackMethod = "getProductByIdFallback")
    public ProductDto getProductById(@PathVariable long id);

    default ProductDto getProductByIdFallback(long id, Exception ex) {
        System.err.println("Fallback for product-service");
        System.err.println(ex.getMessage());
        return new ProductDto(id, "Unknown Product", 0.0);
    }


}
