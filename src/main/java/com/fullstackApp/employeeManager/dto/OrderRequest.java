package com.fullstackApp.employeeManager.dto;

import com.fullstackApp.employeeManager.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {

    private Customer customer;

}

//In a Spring Boot application, the "dto" folder is often used to store Data Transfer Objects (DTOs). DTOs are objects that carry data between different layers of an application, typically between the presentation layer (e.g., controllers or REST controllers) and the service layer.
//
//Here's a brief explanation of the use of the "dto" folder:
//
//Separation of Concerns:
//
//Keeping DTOs in a separate folder like "dto" helps in organizing the code and maintaining a clear separation of concerns.
//DTOs are specifically designed to transfer data between layers and are often tailored to the needs of the presentation layer. Separating them from entities or domain objects helps avoid mixing concerns and maintains a clean and modular code structure.
//Presentation Layer:
//
//DTOs are commonly used to encapsulate data that needs to be sent between the frontend and backend of a web application. For example, when handling HTTP requests and responses in a Spring MVC or Spring WebFlux application, DTOs can be used to represent the data exchanged between the client and the server.
//Reducing Overhead:
//
//DTOs can be customized to include only the necessary data for a particular use case, reducing the amount of data transferred over the network. This can be important for performance considerations, especially in RESTful APIs.
//Versioning and Compatibility:
//
//When evolving an API or making changes to the internal representation of data, DTOs can act as a buffer, allowing you to make changes to the internal data structures without affecting the external API contract. This helps in maintaining backward compatibility.