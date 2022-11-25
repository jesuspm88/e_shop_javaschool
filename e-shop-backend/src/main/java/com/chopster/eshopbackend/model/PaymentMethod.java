package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "payment_method")
public class PaymentMethod implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_method_id", nullable = false, updatable = false)
    private Integer p_method_id;
    private Integer p_method_name;

    public PaymentMethod() {
    }
}
