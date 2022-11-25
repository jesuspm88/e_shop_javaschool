package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.OrderNotFoundException;
import com.chopster.eshopbackend.model.Order;
import com.chopster.eshopbackend.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderService {
    private final OrderRepo orderRepo;

    @Autowired
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

    public Order findOrderById(Integer id){
        return orderRepo.findOrderById(id).orElseThrow(() -> new OrderNotFoundException("Order by id " + id + " was not found."));
    }

    public void deleteOrder(Integer id){
        orderRepo.deleteOrderById(id);
    }
}
