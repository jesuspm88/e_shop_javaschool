package com.chopster.eshopbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
class ProductPerOrderKey implements Serializable {

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "order_id")
    private Integer orderId;

    // standard constructors, getters, and setters
    // hashcode and equals implementation
}
