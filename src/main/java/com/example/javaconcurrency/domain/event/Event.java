package com.example.javaconcurrency.domain.event;

import jakarta.persistence.*;

@Entity
public class Event {
    @Id
    @Column(name = "event_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_name")
    private String name;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "rest_quantity")
    private int restQuantity;
}
