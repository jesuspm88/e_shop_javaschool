package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", nullable = false, updatable = false)
    private Long product_id;
    private String product_name;
    private Float product_price;
    private Float product_weight;
    private Float product_volume;
    private String product_brand;
    private String product_color;
    private String product_imgUrl;
    private Integer product_category_id;
    private Integer product_stock;

    @OneToMany(mappedBy = "product")
    Set<ProductPerOrder> productsPerOrder;


    public Product() {
    }
}
