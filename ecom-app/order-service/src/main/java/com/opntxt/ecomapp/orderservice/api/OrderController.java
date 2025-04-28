package com.opntxt.ecomapp.orderservice.api;

import com.opntxt.ecomapp.orderservice.dto.OrderRequestDto;
import com.opntxt.ecomapp.orderservice.model.OrderEntity;
import com.opntxt.ecomapp.orderservice.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    private OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public OrderEntity placeOrder(@RequestBody OrderRequestDto orderRequest) {
        return orderService.placeOrder(orderRequest);
    }

    @GetMapping
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public OrderEntity getOrderById(@PathVariable long id) {
        return orderService.getOrderById(id);
    }


}
