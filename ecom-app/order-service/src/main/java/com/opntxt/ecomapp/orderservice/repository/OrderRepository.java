package com.opntxt.ecomapp.orderservice.repository;

import com.opntxt.ecomapp.orderservice.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
