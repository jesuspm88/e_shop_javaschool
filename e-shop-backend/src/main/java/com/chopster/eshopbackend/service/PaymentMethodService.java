package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.PaymentMethodNotFoundException;
import com.chopster.eshopbackend.model.PaymentMethod;
import com.chopster.eshopbackend.repo.PaymentMethodRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentMethodService {
    private final PaymentMethodRepo paymentMethodRepo;

    @Autowired
    public PaymentMethodService(PaymentMethodRepo paymentMethodRepo) {
        this.paymentMethodRepo = paymentMethodRepo;
    }

    public PaymentMethod addPaymentMethod(PaymentMethod paymentMethod){
        return paymentMethodRepo.save(paymentMethod);
    }

    public List<PaymentMethod> findAllPaymentMethods() {
        return paymentMethodRepo.findAll();
    }

    public PaymentMethod updatePaymentMethod(PaymentMethod paymentMethod){
        return paymentMethodRepo.save(paymentMethod);
    }

    public PaymentMethod findPaymentMethodById(Integer id){
        return paymentMethodRepo.findPaymentMethodById(id).orElseThrow(() -> new PaymentMethodNotFoundException("Payment method by id " + id + " was not found."));
    }

    public void deletePaymentMethod(Integer id){
        paymentMethodRepo.deletePaymentMethodById(id);
    }
}