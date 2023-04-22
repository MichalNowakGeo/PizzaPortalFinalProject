package com.pizzaproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@Table(name = "Customer_account")
public class CustomerAccount {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "users_username", nullable = false)
    @OneToOne
    private User user;

    @OneToOne
    @Column(name = "adress_id")
    private Address address;

    @OneToMany
    private List<Order> orders;

    @OneToMany
    private List<OrderHistory> ordersHistory;

}
