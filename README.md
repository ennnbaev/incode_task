# User Management RESTful API

This project implements a simple RESTful API for managing users. It allows you to perform CRUD operations on the `User` entity.

## Build and Run Instructions

To build and run the application, follow these steps:

### Prerequisites
- Java 17
- Maven
- Docker (optional)

### 1. Clone the repository
Clone the repository:\
git clone https://github.com/ennnbaev/incode_task

### 2.Build the application:
cd incode\
mvn clean package

### 3.Run the application using Docker Compose:
docker-compose up --build

This will start the application and a MongoDB database in separate Docker containers.\
The application will be accessible at http://localhost:8585.

## Clean Code Principles
In this project, I followed clean code principles to ensure the code is readable, maintainable, and adheres to best practices. Here are some examples of how I applied these principles:

#### DRY (Don't Repeat Yourself):
I extracted common functionality, such as database connection setup, into separate reusable components to avoid duplication.\
I used service classes to encapsulate business logic and promote code reuse across multiple endpoints.\
#### SOLID principles:
I applied the Single Responsibility Principle by ensuring each class and method has a clear and specific purpose.\
I followed the Open/Closed Principle by designing classes and interfaces that are easily extendable without modifying existing code.\
I used dependency injection to adhere to the Dependency Inversion Principle and promote loose coupling between components.\
#### Meaningful Naming:
I chose descriptive names for variables, methods, classes, and packages to make the code self-explanatory and improve readability.\
I used consistent naming conventions throughout the project to maintain clarity and consistency.\
#### Code Formatting and Structure:
I followed a consistent code formatting style, including indentation, line length, and spacing, to improve readability and maintainability.\
I organized the code into logical modules, packages, and classes, following a layered architecture to promote separation of concerns.\
#### Comments and Documentation:
I added comments to clarify complex logic, explain design decisions, and provide insights into the code's functionality.\
I provided README files and inline documentation to guide developers on how to build, run, and use the application effectively.\
By applying these clean code principles, I aimed to create a codebase that is easy to understand, maintain, and extend. The code's structure, naming conventions, and documentation contribute to its readability and promote collaboration among developers.

## Additional functionality
##### 1.Documentation of the REST application using Swagger Open Api along the way http://localhost:8585/swagger-ui/index.html#/
##### 2.Added integration tests to check the functionality with the database
##### 3.Added data validation for the user's name and email (I know what is better to do on the DTO model, but this is a temporary solution that demonstrates skills)
##### 4.Added custom action and user-friendly messages
##### 5.Added GlobalExceptionHandler
