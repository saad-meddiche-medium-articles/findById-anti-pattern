package com.saadMeddiche.findById_anti_pattern.repositories;

import com.saadMeddiche.findById_anti_pattern.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> { }