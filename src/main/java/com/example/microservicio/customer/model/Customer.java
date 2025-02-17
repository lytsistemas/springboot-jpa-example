package com.example.microservicio.customer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único del cliente

    @NotBlank(message = "El nombre es obligatorio.")
    private String nombre; // Nombre del cliente

    @NotBlank(message = "El correo electrónico es obligatorio.")
    @Email(message = "Debe ser un correo electrónico válido.")
    private String correoElectronico; // Correo electrónico del cliente

    @NotNull(message = "La fecha de registro es obligatoria.")
    private LocalDate fechaRegistro; // Fecha de registro del cliente

    @NotNull(message = "El estado de actividad es obligatorio.")
    private Boolean estadoActividad; // Estado de actividad del cliente (activo/inactivo)
}
