# IT3030 – Programming Applications Framework (PAF)

## Session 3 – Practical Extension

### Custom Greeting REST API using Spring Boot

---

## 📘 Module Information

* **Module Code:** IT3030
* **Module Name:** Programming Applications Framework (PAF)
* **Practical Session:** Session 3 – REST Endpoints
* **Student Name:** Malith Malshan

---

# 📌 Project Overview

This project is an extension of Practical 3 and demonstrates the implementation of RESTful web services using Spring Boot.
The application exposes a custom greeting endpoint that supports:

* Basic GET requests
* Path variables
* Optional query parameters

The project is designed to reinforce understanding of REST endpoints and request handling in Spring Boot.

---

# ✅ Assignment Requirement Verification

## 1️⃣ Basic Endpoint

* Endpoint: `/greet`
* Method: GET
* Response: `Welcome to Spring Boot!`
* ✔ Requirement Successfully Implemented

## 2️⃣ Path Variable Support

* Endpoint: `/greet/{name}`
* Example: `/greet/John`
* Response: `Hello John! Welcome to Spring Boot!`
* ✔ Requirement Successfully Implemented

## 3️⃣ Extension – Optional Query Parameter

* Endpoint: `/greet/{name}?message=YourMessage`
* Example: `/greet/John?message=Good to see you!`
* Response: `Hello John! Good to see you!`
* ✔ Extension Requirement Successfully Implemented

---

# 🛠 Technologies Used

* Java
* Spring Boot
* Maven (Maven Wrapper)
* Embedded Apache Tomcat Server


## 🔹 Step 1: Run the Application (Using Maven Wrapper)

On Windows:

```
.\mvnw spring-boot:run
```

On Mac/Linux:

```
./mvnw spring-boot:run
```

---

## 🔹 Step 2: Verify Application Startup

Successful startup message:

```
Tomcat started on port(s): 8081
Started Application
```

---

# 🌐 API Testing Guide

Base URL:

```
http://localhost:8081
```

## ✅ Test Case 1 – Basic Greeting

```
http://localhost:8081/greet
```

Expected Output:

```
Welcome to Spring Boot!
```

---

## ✅ Test Case 2 – Personalized Greeting

```
http://localhost:8081/greet/John
```

Expected Output:

```
Hello John! Welcome to Spring Boot!
```

---

## ✅ Test Case 3 – Greeting with Custom Message

(Note: Replace spaces with `%20` in URLs)

```
http://localhost:8081/greet/John?message=Good%20to%20see%20you!
```

Expected Output:

```
Hello John! Good to see you!
```

---

# 📂 Project Structure

```
src/
 └── main/
     ├── java/
     │   └── controller (REST Controller class)
     └── resources/
         └── application.properties
pom.xml
mvnw / mvnw.cmd
```

---

# 🎯 Learning Outcomes Demonstrated

* Creation of RESTful endpoints using `@GetMapping`
* Handling path variables using `@PathVariable`
* Handling optional query parameters using `@RequestParam`
* Running Spring Boot applications using Maven Wrapper
* Testing APIs via browser or Postman

---

# 📎 Conclusion

This project successfully fulfills all the requirements specified in IT3030 – PAF Session 3 practical extension.
The application demonstrates proper REST API implementation and request handling using Spring Boot.

---

**End of README**
