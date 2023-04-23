package com.pizzaproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import com.pizzaproject.enums.OrderStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "order_status")
    private OrderStatus orderStatus;

    @Column(name = "order_time")
    private LocalDateTime orderTime;

    @Column(name = "delivery_time")
    private LocalDateTime deliveryTime;
    private String comment;

    private BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_account_id", referencedColumnName = "id")
    private CustomerAccount customerAccount;
}
