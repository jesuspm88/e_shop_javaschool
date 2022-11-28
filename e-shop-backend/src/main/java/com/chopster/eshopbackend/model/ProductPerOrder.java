package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class ProductPerOrder implements Serializable {
    @EmbeddedId
    Integer id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order pxo_order;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product pxo_product;

    private Integer pxo_quantity;

    public ProductPerOrder() {
    }
}
