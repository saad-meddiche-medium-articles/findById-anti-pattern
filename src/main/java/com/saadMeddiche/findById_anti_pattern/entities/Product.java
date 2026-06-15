package com.saadMeddiche.findById_anti_pattern.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence_generator")
    @SequenceGenerator(name = "product_sequence_generator", sequenceName = "product_sequence")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, length = 5000)
    private String description;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false, unique = true)
    private UUID serial;

    @ManyToOne(fetch = FetchType.LAZY)
    private Person owner;

}