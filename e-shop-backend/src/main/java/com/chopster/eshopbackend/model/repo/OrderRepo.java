package com.chopster.eshopbackend.model.repo;

import com.chopster.eshopbackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface OrderRepo extends JpaRepository<Order, Long> {
    void deleteOrderById(Long id);

    Optional<Order> findOrderById(Long id);
}
