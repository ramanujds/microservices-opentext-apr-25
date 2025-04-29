package com.opntxt.ecomapp.orderservice.service;

import com.opntxt.ecomapp.orderservice.client.ProductServiceClient;
import com.opntxt.ecomapp.orderservice.dto.OrderRequestDto;
import com.opntxt.ecomapp.orderservice.dto.ProductDto;
import com.opntxt.ecomapp.orderservice.model.OrderEntity;
import com.opntxt.ecomapp.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrderService {

    private OrderRepository orderRepo;
    private ProductServiceClient productClient;
//    private KafkaTemplate<String, String> kafkaTemplate;

//    @Value("${kafka.topic}")
//    private String topic;

    public OrderService(OrderRepository orderRepo, ProductServiceClient productClient
                        // KafkaTemplate<String, String> kafkaTemplate
                         ) {
        this.orderRepo = orderRepo;
        this.productClient = productClient;
       //  this.kafkaTemplate = kafkaTemplate;
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

        var order = orderRepo.save(orderDetails);

    //    kafkaTemplate.send(topic, order.toString());

        return order;


    }

    public List<OrderEntity> getAllOrders() {
        return orderRepo.findAll();
    }

    public OrderEntity getOrderById(long id) {
      return orderRepo.findById(id).orElseThrow(()->new RuntimeException("Order not found"));
    }




}
