package com.example.cafespring.Service.interfaces;

import com.example.cafespring.Entity.ClientEntity;
import com.example.cafespring.Entity.OrderEntity;
import com.example.cafespring.Entity.StaffEntity;
import com.example.cafespring.Repository.OrderRepository;
import com.example.cafespring.Service.IOrderService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<OrderEntity> findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<OrderEntity> findOrdersByDate(Date date) {
        return orderRepository.findOrdersByDate(date);
    }

    @Override
    public List<OrderEntity> findOrdersInDateRange(Date startDate, Date endDate) {
        return orderRepository.findOrdersInDateRange(startDate, endDate);
    }

    @Override
    public List<?> findClientsAndBaristaTodayOrder() {
        List<List<?>> result = new ArrayList<>();

// Добавление элементов в двумерный список
        List<ClientEntity> clients = new ArrayList<>();
        List<StaffEntity> staff = new ArrayList<>();


        for (OrderEntity order : orderRepository.findClientAndBaristaTodayOrder())
        {
            clients.add(order.getClient());
            staff.add(order.getStaff());

        }


        result.add(clients);
        result.add(staff);
        return result;

    }

    @Override
    public OrderEntity saveOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }

    @Override
    public OrderEntity updateOrder(OrderEntity orderEntity) {
        return orderRepository.save(orderEntity);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
