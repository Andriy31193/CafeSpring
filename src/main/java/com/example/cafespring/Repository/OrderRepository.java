package com.example.cafespring.Repository;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
