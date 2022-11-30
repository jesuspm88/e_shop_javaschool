package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.OrderNotFoundException;
import com.chopster.eshopbackend.model.Order;
import com.chopster.eshopbackend.model.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order addOrder(Order order){
        return orderRepo.save(order);
    }

    public List<Order> findAllOrders() {
        return orderRepo.findAll();
    }

    public Order updateOrder(Order order){
        return orderRepo.save(order);
    }

    public Order findOrderById(Long id){
        return orderRepo.findOrderById(id).orElseThrow(() -> new OrderNotFoundException("Order by id " + id + " was not found."));
    }

    public void deleteOrder(Long id){
        orderRepo.deleteOrderById(id);
    }
}
