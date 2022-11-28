package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "order")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false, updatable = false)
    private Integer order_id;
    private Integer order_user_id;
    private String order_address_id;
    private Date order_date;
    private Float order_price;
    private Integer order_payment_method;
    private String order_delivery;
    private Boolean order_payment_status;
    private Integer order_status_id;

    @OneToMany(mappedBy = "pxo_order")
    Set<ProductPerOrder> productsPerOrder;

    public Order() {
    }
}
