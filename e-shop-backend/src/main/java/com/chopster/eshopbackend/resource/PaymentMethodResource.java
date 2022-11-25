package com.chopster.eshopbackend.resource;

import com.chopster.eshopbackend.model.PaymentMethod;
import com.chopster.eshopbackend.service.PaymentMethodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment-method")
public class PaymentMethodResource {
    private final PaymentMethodService paymentMethodService;

    public PaymentMethodResource(PaymentMethodService paymentMethodService) {
        this.paymentMethodService = paymentMethodService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PaymentMethod>> getAllPaymentMethods(){
        List<PaymentMethod> paymentMethods = paymentMethodService.findAllPaymentMethods();
        return new ResponseEntity<>(paymentMethods, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PaymentMethod> getPaymentMethodById(@PathVariable("id") Integer id){
        PaymentMethod paymentMethod = paymentMethodService.findPaymentMethodById(id);
        return new ResponseEntity<>(paymentMethod, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<PaymentMethod> addPaymentMethod(@RequestBody PaymentMethod paymentMethod){
        PaymentMethod newPaymentMethod = paymentMethodService.addPaymentMethod(paymentMethod);
        return new ResponseEntity<>(newPaymentMethod, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<PaymentMethod> updatePaymentMethod(@RequestBody PaymentMethod paymentMethod){
        PaymentMethod updatePaymentMethod = paymentMethodService.updatePaymentMethod(paymentMethod);
        return new ResponseEntity<>(updatePaymentMethod, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePaymentMethod(@PathVariable("id") Integer id){
        paymentMethodService.deletePaymentMethod(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}