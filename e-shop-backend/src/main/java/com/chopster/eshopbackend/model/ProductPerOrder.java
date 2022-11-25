package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ProductPerOrder implements Serializable {
    @EmbeddedId
    ProductPerOrderKey id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "pxo_order_id")
    private Order order;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "pxo_product_id")
    private Product product;

    private Integer pxo_quantity;

    public ProductPerOrder() {
    }
}
