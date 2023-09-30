package com.example.cafespring.Service;

import com.example.cafespring.Entity.OrderEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<OrderEntity> findAll();
    Optional<OrderEntity> findById(Long id);
    OrderEntity saveOrder(OrderEntity orderEntity);
    OrderEntity updateOrder(OrderEntity orderEntity);
    void deleteOrder(Long id);
}