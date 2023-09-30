package com.example.cafespring.Repository;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
    @Query("SELECT o FROM OrderEntity o WHERE o.date = CURRENT_DATE")
    List<OrderEntity> findOrdersByDate(Date date);

    @Query("SELECT o FROM OrderEntity o WHERE o.date BETWEEN :startDate AND :endDate")
    List<OrderEntity> findOrdersInDateRange(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
