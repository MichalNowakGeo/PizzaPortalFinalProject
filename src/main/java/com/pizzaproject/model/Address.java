package com.pizzaproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String line1;

    private String line2;

    @Column(name = "postal_code")
    private String postalCode;

    private String citi;

    @Column(name = "phone_number")
    private String phoneNumber;
}
