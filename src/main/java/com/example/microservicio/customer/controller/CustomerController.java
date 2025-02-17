package com.example.microservicio.customer.controller;

import com.example.microservicio.customer.model.*;
import com.example.microservicio.customer.service.*;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    // Constructor que inyecta el servicio de clientes
    public CustomerController(CustomerService service) {
        this.service = service;
    }

    // Método para obtener todos los clientes
    @GetMapping
    public List<Customer> getAll() {
        return service.findAll();
    }

    // Método para obtener un cliente por su ID
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {
        return service.findById(id);
    }

    // Método para crear un nuevo cliente
    @PostMapping
    public ResponseEntity<Customer> create(@Valid @RequestBody Customer customer) {
        return new ResponseEntity<>(service.save(customer), HttpStatus.CREATED);
    }

    // Método para actualizar un cliente existente
    @PutMapping("/{id}")
    public Customer update(@PathVariable Long id, @Valid @RequestBody Customer customer) {
        return service.update(id, customer);
    }

    // Método para eliminar un cliente por su ID
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
