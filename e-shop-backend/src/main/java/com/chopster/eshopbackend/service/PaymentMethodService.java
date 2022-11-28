package com.chopster.eshopbackend.service;

import com.chopster.eshopbackend.exception.PaymentMethodNotFoundException;
import com.chopster.eshopbackend.model.PaymentMethod;
import com.chopster.eshopbackend.repo.PaymentMethodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {
    @Autowired
    private PaymentMethodRepo paymentMethodRepo;

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

    public PaymentMethod findPaymentMethodById(Long id){
        return paymentMethodRepo.findPaymentMethodById(id).orElseThrow(() -> new PaymentMethodNotFoundException("Payment method by id " + id + " was not found."));
    }

    public void deletePaymentMethod(Long id){
        paymentMethodRepo.deletePaymentMethodById(id);
    }
}
