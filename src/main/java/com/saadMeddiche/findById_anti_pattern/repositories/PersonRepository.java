package com.saadMeddiche.findById_anti_pattern.repositories;

import com.saadMeddiche.findById_anti_pattern.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> { }