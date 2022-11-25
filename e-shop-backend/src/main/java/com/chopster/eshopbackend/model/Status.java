package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "status")
public class Status implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id", nullable = false, updatable = false)
    private Integer status_id;
    private Integer status_name;

    public Status() {
    }
}
