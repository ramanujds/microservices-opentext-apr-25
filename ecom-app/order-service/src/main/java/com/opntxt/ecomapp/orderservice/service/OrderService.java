package com.opntxt.ecomapp.orderservice.service;

import com.opntxt.ecomapp.orderservice.client.ProductServiceClient;
import com.opntxt.ecomapp.orderservice.dto.OrderRequestDto;
import com.opntxt.ecomapp.orderservice.dto.ProductDto;
import com.opntxt.ecomapp.orderservice.model.OrderEntity;
import com.opntxt.ecomapp.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepo;
//    private RestTemplate restTemplate;
    private ProductServiceClient productClient;

    public OrderService(OrderRepository orderRepo, ProductServiceClient productClient) {
        this.orderRepo = orderRepo;
        this.productClient = productClient;
    }

    public OrderEntity placeOrder(OrderRequestDto orderRequest) {

//        ProductDto product = restTemplate.getForObject("http://PRODUCT-SERVICE/api/v1/products/" + orderRequest.productId(), ProductDto.class);

        ProductDto product = productClient.getProductById(orderRequest.productId());

        double total = product.price()*orderRequest.quantity();

        OrderEntity orderDetails = new OrderEntity();
        orderDetails.setProductId(orderRequest.productId());
        orderDetails.setProductName(product.name());
        orderDetails.setQuantity(orderRequest.quantity());
        orderDetails.setPrice(product.price());
        orderDetails.setTotalAmount(total);
        orderDetails.setOrderDate(LocalDate.now());

        return orderRepo.save(orderDetails);


    }

    public List<OrderEntity> getAllOrders() {
        return orderRepo.findAll();
    }

    public OrderEntity getOrderById(long id) {
      return orderRepo.findById(id).orElseThrow(()->new RuntimeException("Order not found"));
    }




}
