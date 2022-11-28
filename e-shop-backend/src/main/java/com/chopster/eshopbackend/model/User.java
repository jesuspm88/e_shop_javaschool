package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false, updatable = false)
    private Integer user_id;
    private String user_password;
    private String user_first_name;
    private String user_last_name;
    private String user_email;
    private Integer user_phone;
    private Date user_birthdate;
    @JoinTable(
            name = "address_ownership",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id"))
    @ManyToMany
    Set<Address> ownedAdresses;

    public User() {
    }
}
