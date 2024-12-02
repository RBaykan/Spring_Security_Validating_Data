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
`git clone https://github.com/RBaykan/Spring_Security_Validating_Data.git`
Navigate to the project folder and open it in your preferred IDE (e.g., Eclipse, IntelliJ) and run.


If you want to run it with maven, run a terminal in the project path and enter the following command.
`mvn spring-boot:run`

The application will be available at http://localhost:8080.


**Usage**
- **Registration Endpoint**: `/api/register` - POST method is used to create a new user, but this project will only validate User data sent via POST method.

Example JSON for User Registration:

`{   "firstname": "John",   "lastname": "Doe",   "username": "johndoe",   "password": "SecurePass123",   "matchingPassword": "SecurePass123",   "email": "johndoe@example.com" }`

Custom Validations
### Example JSON for User Registration:

json

Kodu kopyala

`{   "firstname": "John",   "lastname": "Doe",   "username": "johndoe",   "password": "SecurePass123",   "matchingPassword": "SecurePass123",   "email": "johndoe@example.com" }`

## Custom Validations

- **Email Validation**: Ensures that the email is well-formed using a regular expression.
- **Password Matching Validation**: Ensures that the `password` and `matchingPassword` fields match.
- **Email Validation**: Ensures that the email is well-formed using a regular expression.
- **Password Matching Validation**: Ensures that the `password` and `matchingPassword` fields match.
