package com.chopster.eshopbackend.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id", nullable = false, updatable = false)
    private Long user_id;
    private String user_password;
    private String user_first_name;
    private String user_last_name;
    private String user_email;
    private Integer user_phone;
    private Date user_birthdate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Integer user_address_id;

    public User() {
    }
}
