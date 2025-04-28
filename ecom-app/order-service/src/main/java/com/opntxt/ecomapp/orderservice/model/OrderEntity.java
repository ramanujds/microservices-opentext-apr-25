package com.opntxt.ecomapp.orderservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long productId;
    private String productName;
    private int quantity;
    private double price;
    private double totalAmount;
    private LocalDate orderDate;


}
