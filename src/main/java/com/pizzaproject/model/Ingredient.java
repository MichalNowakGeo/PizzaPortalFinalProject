package com.pizzaproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
@Table(name = "ingredients")
@Getter
@Setter
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  String id;

    @Column(nullable = false, unique = true)
    private String name;

    private String description;

    private boolean available;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    //Pizza class and "pizzas" table do not exist. Need to check after adding Pizza to model
    //@ManyToMany(mappedBy = "pizzas")
    //private Set<Pizza> pizzas;
}
