package com.example.microservicio.customer.service;

import com.example.microservicio.customer.exception.*;
import com.example.microservicio.customer.model.*;
import com.example.microservicio.customer.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    // Constructor que inyecta el repositorio de clientes
    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    // Método para obtener todos los clientes
    public List<Customer> findAll() {
        return repository.findAll();
    }

    // Método para encontrar un cliente por su ID
    public Customer findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CustomerNotFoundException("Cliente no encontrado con id: " + id));
    }

    // Método para guardar un nuevo cliente
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    // Método para actualizar un cliente existente
    public Customer update(Long id, Customer updatedCustomer) {
        Customer existingCustomer = findById(id);
        existingCustomer.setNombre(updatedCustomer.getNombre());
        existingCustomer.setCorreoElectronico(updatedCustomer.getCorreoElectronico());
        existingCustomer.setFechaRegistro(updatedCustomer.getFechaRegistro());
        existingCustomer.setEstadoActividad(updatedCustomer.getEstadoActividad());
        return repository.save(existingCustomer);
    }

    // Método para eliminar un cliente por su ID
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
