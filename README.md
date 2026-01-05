# 🚀 Gestão de Vagas 
## 📌 Project Overview
This project is a Spring Boot application for managing job candidate data. It features a RESTful API with validation, error handling, and PostgreSQL integration via Docker. The code follows Jakarta EE standards with Spring Data JPA, Lombok, and modern Java 25 features.
## 🔍 Key Features
- ✅ Candidate management (CRUD operations)
- 🛡️ Data validation with JSR 303 constraints
- 🚀 Automatic error handling with `ExceptionHandlerController`
- 🐍 PostgreSQL integration via Docker
- 🧠 Lombok for boilerplate reduction
- 📦 Spring Boot starter dependencies (Web MVC, Validation, Data JPA)

## 📦 Technologies Used

| Technology | Version |
| --- | --- |
| Java | 25 |
| Spring Boot | 4.0.1 |
| Spring Data JPA | 4.0.1 |
| Lombok | 1.18.42 |
| PostgreSQL | 42.7.8 |
| Docker | N/A (via compose) |
## 📁 Folder Structure
```
gestao_vagas/
├── .mvn/              # Maven wrapper config
├── src/               # Main application code
│   ├── main/          # Production code
│   │   ├── java/      # Java source files
│   │   └── resources/ # Configuration files
│   └── test/          # Unit tests
├── .gitignore         # Git ignore rules
├── docker-compose.yml # PostgreSQL container setup
├── pom.xml            # Maven build configuration
└── HELP.md            # Additional documentation
```
## 🚀 Getting Started
### 1. Prerequisites
- Java 25
- Maven
- Docker (for PostgreSQL)

### 2. Run the Application
``` bash
mvn spring-boot:run
```



