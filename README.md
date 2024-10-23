## 1. Spring Basic Project (Spring1)
Description : This project likely contains basic Spring framework setup, possibly involving XML-based configuration (spring.xml) in the target/classes directory.
#### Key Files:
- spring.xml : Contains Spring configuration.

## 2. Spring JDBC Project (SpringJDBC)
Description : A project that demonstrates the use of Spring JDBC for database interactions. This includes models, repositories, and services to interact with the database.
#### Key Files:
- SpringJdbcApplication.java : Main class to bootstrap the application.<br>
- Student.java : A model representing the "Student" entity.<br>
- StudentRepo.java : A repository interface for database operations.<br>
- StudentService.java : Service layer for managing business logic.<br>
- application.properties : Likely contains database configurations.<br>

## 3. Spring Boot Web Project (SpringBootWeb)
Description : A Spring Boot-based web application with servlet support, handling HTTP requests and responses.
#### Key Files:
- App.java : The entry point of the Spring Boot application.<br>
- HelloServlet.java : A servlet that handles HTTP requests.<br>
- AppTest.java : Unit tests for the application.<br>

## 4. Spring Data JPA Project (SpringDataJpa)
Description : Demonstrates the use of Spring Data JPA to interact with a relational database using the JPA (Java Persistence API).
#### Key Files:
- SpringDataJpaApplication.java : Main application class.<br>
- StudentRepo.java : Repository interface for "Student" entity operations.<br>
- Student.java : Entity representing a "Student" in the database.<br>

## 5. Spring Boot REST with AOP Project (SpringBootRest (AOP))
Description : A RESTful Spring Boot application with Aspect-Oriented Programming (AOP) features. This project focuses on REST API development and cross-cutting concerns like logging and performance monitoring.
#### Key Files:
- SpringBootRestApplication.java : The main entry point of the REST application.<br>
- JobRestController.java : REST controller managing job-related HTTP requests.<br>
- LoggingAspect.java, PerformanceMonitorAspect.java, ValidationAspect.java : Aspects for logging, performance monitoring, and validation using AOP.<br>
- JobPost.java : Represents the "JobPost" entity.<br>
- JobRepo.java : Repository interface for job-related database operations.<br>
