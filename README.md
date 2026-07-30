# CRUD-Java

A Java application demonstrating basic CRUD operations (Create, Read, Update, Delete).

If you want to learn more about Java development, please visit the official documentation: [https://docs.oracle.com/en/java/](https://docs.oracle.com/en/java/).

## Running the application in dev mode

You can run your application in development mode using Maven:

```bash
./mvnw clean spring-boot:run
NOTE: If you don't use the wrapper, you can execute mvn spring-boot:run.

Packaging and running the application
The application can be packaged using:

./mvnw package
java -jar target/crud-java-0.0.1-SNAPSHOT.jar

Prerequisites and Setup
Make sure you have Java JDK installed and your database properly configured in src/main/resources/application.properties before running the build or dev mode.

Example database configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/crud_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

Related Guides
Spring Data JPA: Persist data in SQL stores with Java Persistence API using Spring Data Repositories.

Spring Web: Build RESTful applications using Spring MVC.

MySQL Driver: Connect to the MySQL database via JDBC.

API Endpoints
The application exposes RESTful endpoints for managing resources:

POST /api/resources - Create a new entry

GET /api/resources - Get all entries

GET /api/resources/{id} - Get entry by ID

PUT /api/resources/{id} - Update entry by ID

DELETE /api/resources/{id} - Delete entry by ID
