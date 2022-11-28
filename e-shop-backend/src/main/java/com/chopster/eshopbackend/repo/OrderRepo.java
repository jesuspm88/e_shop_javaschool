package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    void deleteOrderById(Long id);

    Optional<Order> findOrderById(Long id);
}
