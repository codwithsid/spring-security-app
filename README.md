# 🔐 Spring Boot Security Application

A secure backend application built using **Spring Boot** that implements authentication and authorization using JWT (JSON Web Token). This project follows a clean layered architecture and is containerized using Docker.

---

## 🚀 Features

* 🔑 User Registration & Login
* 🔐 JWT-based Authentication
* 🛡️ Spring Security Integration
* 📦 Layered Architecture (Controller, Service, Repository)
* 🧾 DTO-based request/response handling
* 🐳 Dockerized Application
* ⚡ Maven Build System

---

## 🏗️ Project Structure

```
com.example.security
│
├── config          # Security & App configurations
│   ├── AppConfig
│   ├── JwtFilter
│   └── SecurityConfig
│
├── controller      # REST Controllers
│   ├── AuthController
│   └── UserController
│
├── dto             # Data Transfer Objects
│   ├── LoginDTO
│   └── RegisterDTO
│
├── entity          # Database Entities
│   └── Users
│
├── repository      # Data Access Layer
│   └── UsersRepository
│
├── service         # Business Logic Layer
│   ├── AuthService
│   ├── JwtService
│   ├── UsersService
│   └── impl
│       └── UsersServiceImpl
│
└── SecurityApplication  # Main Class
```

---

## ⚙️ Tech Stack

* Java 17 / 21
* Spring Boot
* Spring Security
* JWT
* Maven
* Docker

---

## ▶️ Run Locally

### 1. Build the Project

```bash
mvn clean package
```

### 2. Run the Application

```bash
java -jar target/*.jar
```

---

## 🐳 Run with Docker

### Build Docker Image

```bash
docker build -t security-app .
```

### Run Container

```bash
docker run -p 8080:8080 security-app
```

---

## 🔑 API Endpoints

| Method | Endpoint       | Description       |
| ------ | -------------- | ----------------- |
| POST   | /auth/register | Register new user |
| POST   | /auth/login    | Login user        |

---

## 🧠 Key Concepts Used

* JWT Token Generation & Validation
* Filter-based Authentication
* Stateless Session Management
* Clean Code Architecture

---

## 📌 Future Enhancements

* Role-based Authorization (RBAC)
* Refresh Tokens
* Swagger Documentation
* Database Integration (MySQL/PostgreSQL)

---

## 👨‍💻 Author

**Siddhant Bhore**

---

## ⭐ If you like this project

Give it a star on GitHub ⭐
