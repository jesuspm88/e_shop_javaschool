package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Long> {
    void deleteOrderById(Long id);

    Optional<Order> findOrderById(Long id);
}
