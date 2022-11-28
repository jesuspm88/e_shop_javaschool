package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id", nullable = false, updatable = false)
    private Integer address_id;
    private Integer address_number;
    private String address_street;
    private String address_city;
    private String address_state;
    private String address_zip;
    @ManyToMany(mappedBy = "ownedAdresses")
    Set<User> addressOwners;
    public Address() {
    }
}
