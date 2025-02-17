package com.example.microservicio.customer.repository;

import com.example.microservicio.customer.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    // Este repositorio proporciona métodos CRUD para la entidad Customer
}
