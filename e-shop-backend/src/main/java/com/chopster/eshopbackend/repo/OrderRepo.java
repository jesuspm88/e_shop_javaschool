package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Integer> {
    void deleteOrderById(Integer id);

    Optional<Order> findOrderById(Integer id);
}
