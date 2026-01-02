# GymBackEnd

## Project Purpose
GymBackEnd is a backend solution for a fitness center, managing users, trainers, workout plans, equipment, check-ins, classes, and login. The system is built with Java and Spring Boot and provides REST API endpoints for integration with frontend or other systems.

## Features
- User and trainer management
- Creation and management of workout plans
- Management of equipment and classes
- Check-in functionality
- Login and security with JWT

## Directory Structure
```
GymBackEnd/
├── src/
│   ├── main/
│   │   ├── java/com/example/gymbackend/
│   │   │   ├── Controllers/         # API controllers
│   │   │   ├── Database/            # Repositories
│   │   │   ├── jwt/                 # JWT security
│   │   │   ├── Mappers/             # DTO mapping
│   │   │   ├── Model/               # Domain models
│   │   │   ├── service/             # Business logic
│   │   ├── Dtos/                    # Data Transfer Objects
│   │   ├── resources/
│   │   │   ├── application.properties # Configuration
│   │   │   ├── keystore.p12           # SSL keystore
│   │   │   ├── spring.licens.txt      # License/guidance
│   ├── test/                         # Test classes
├── pom.xml                           # Maven build
```

## Getting Started
1. **Requirements:**
   - Java 17+
   - Maven
2. **Installation:**
   - Clone the project: `git clone <repo-url>`
   - Navigate to the project folder
3. **Generate keystore.p12:**
   - Open PowerShell in `src/main/resources`
   - Run:
     ```powershell
     & "C:\Program Files\jdk-17.0.8-full\bin\keytool.exe" -genkeypair -alias springboot -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore keystore.p12 -validity 3650
     ```
   - Follow the prompts and use a password with at least 6 characters (e.g., `123456`).
   - See details in `spring.licens.txt` if needed.
4. **Configure application.properties:**
   - Add relevant database and security settings.
   - Example:
     ```properties
     server.port=8080
     spring.datasource.url=jdbc:mysql://localhost:3306/gymdb
     spring.datasource.username=username
     spring.datasource.password=password
     spring.security.jwt.secret=secret
     server.ssl.key-store=classpath:keystore.p12
     server.ssl.key-store-password=123456
     server.ssl.key-store-type=PKCS12
     ```
5. **Build and start the project:**
   - Run: `mvnw spring-boot:run` or `mvn spring-boot:run`

## API Endpoints
The project provides REST API endpoints for CRUD operations for users, trainers, equipment, classes, workout plans, and login. See the controller classes for details.

## Troubleshooting
- Check that keystore.p12 and application.properties are configured correctly.
- Review log messages for errors.

## Contact and Contributions
For questions or contributions, contact the development team or create a pull request.

## License
See `spring.licens.txt` for license information and guidance.
