package com.chopster.eshopbackend.repo;

import com.chopster.eshopbackend.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentMethodRepo extends JpaRepository<PaymentMethod, Integer> {
    void deletePaymentMethodById(Long id);

    Optional<PaymentMethod> findPaymentMethodById(Long id);
}
