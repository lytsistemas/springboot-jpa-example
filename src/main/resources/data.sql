-- Creación de la tabla CUSTOMER
CREATE TABLE CUSTOMER (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    NOMBRE VARCHAR(255) NOT NULL,
    CORREO_ELECTRONICO VARCHAR(255) NOT NULL,
    FECHA_REGISTRO DATE NOT NULL,
    ESTADO_ACTIVIDAD BOOLEAN NOT NULL
);

-- Inserción de datos iniciales en la tabla CUSTOMER
INSERT INTO CUSTOMER (NOMBRE, CORREO_ELECTRONICO, FECHA_REGISTRO, ESTADO_ACTIVIDAD)
VALUES 
    ('John Doe', 'john.doe@example.com', '2023-01-01', TRUE),
    ('Jane Smith', 'jane.smith@example.com', '2023-02-15', FALSE),
    ('Robert Brown', 'robert.brown@example.com', '2023-03-10', TRUE);
