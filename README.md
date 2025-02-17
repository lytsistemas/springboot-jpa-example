# Microservicio

Ejemplo de microservicio CRUD sobre Customer con Spring Boot, BBDD H2 y JPA.


## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/lytsistemas/springboot-jpa-example.git
    ```
2. Instala las dependencias:
    ```bash
    cd microservicio
    mvn install
    ```


## Uso

Para iniciar el microservicio, ejecuta:
```bash
mvn spring-boot:run
```

El microservicio expone los siguientes endpoints para la gestión de clientes:

- `GET /api/customers`: Obtiene todos los clientes.
- `GET /api/customers/{id}`: Obtiene un cliente por su ID.
- `POST /api/customers`: Crea un nuevo cliente.
- `PUT /api/customers/{id}`: Actualiza un cliente existente.
- `DELETE /api/customers/{id}`: Elimina un cliente por su ID.

## Licencia

Este proyecto está licenciado bajo la Licencia L&T Sistemas. Consulta el archivo `LICENSE` para más detalles.
