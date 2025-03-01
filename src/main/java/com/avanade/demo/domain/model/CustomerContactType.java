package com.avanade.demo.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_contacts_types")
public class CustomerContactType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Getters and Setters
}