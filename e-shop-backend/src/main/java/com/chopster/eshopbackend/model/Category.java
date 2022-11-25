package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "category")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id", nullable = false, updatable = false)
    private Integer category_id;
    private Integer category_parent;
    private String category_name;

    public Category() {
    }
}
