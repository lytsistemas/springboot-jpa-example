package com.example.microservicio.customer.exception;

// Esta clase define una excepción personalizada llamada CustomerNotFoundException
// que extiende RuntimeException. Se utiliza para indicar que un cliente no fue encontrado.
public class CustomerNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    // Constructor que recibe un mensaje y lo pasa a la superclase RuntimeException.
    public CustomerNotFoundException(String message) {
        super(message);
    }
}
