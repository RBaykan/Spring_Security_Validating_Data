## Spring Security Validating Data

**Description**
This project implements data validation for RESTful API using Spring Boot and Spring Security. It checks whether the required inputs for the registration system are valid or not and notifies whether to proceed to the next stage for registration or not.

**Features**
- Setting required user data
- Custom Email Validation using regular expression
- Custom Password Match Validation

**Technologies Used**
- **Spring Boot**
- **Spring Security**
- **Spring Validation**
- **Hibernate Validator**
- **Java 21+**

**Project Structure**
The project is structured as follows:

- DTO: Contains  UserDTO.
- Controller: Handles the HTTP requests and user registration logic.
- Validation: Custom validation annotations and logic for email and password matching.

**Installation**
Clone the repository:
```bash
git clone https://github.com/RBaykan/Spring_Security_Validating_Data.git
```
Navigate to the project folder and open it in your preferred IDE (e.g., Eclipse, IntelliJ) and run.


If you want to run it with maven, run a terminal in the project path and enter the following command.
```bash
mvn spring-boot:run
```


The application will be available at http://localhost:8080.


**Usage**
- **Registration Endpoint**: `/api/register` - POST method is used to create a new user, but this project will only validate User data sent via POST method.

Example JSON for User Registration:
To register a user, send a POST request to /api/register with the following JSON body:

```json
{
  "firstname": "Ali",
  "lastname": "Veli",
  "username": "ali_veli",
  "password": "1234",
  "matchingPassword": "1234",
  "email": "aliveli@example.com"
}
```

This request body will be validated for:

- Correct format of the email address.
- Matching passwords.
- Non-empty and valid fields.
- If any validation fails, the appropriate error message will be returned.

The UserDTO class represents a Data Transfer Object (DTO) used for user registration. It contains the fields required for the registration process. Each field is annotated with validation rules to ensure that the data is valid before being accepted by the system.

Annotations Annotated:
- @NotNull: This annotation guarantees that the field must be defined (i.e. not null).
- @NotBlank: This annotation guarantees that the field is not empty or blank (i.e. not an empty string or null).

By setting the annotations on the fields, we can control how the data is validated for the registration system.

## Custom Validations

- **Email Validation**: Ensures that the email is well-formed using a regular expression.
- **Password Matching Validation**: Ensures that the `password` and `matchingPassword` fields match.
- **Email Validation**: Ensures that the email is well-formed using a regular expression.
- **Password Matching Validation**: Ensures that the `password` and `matchingPassword` fields match.
