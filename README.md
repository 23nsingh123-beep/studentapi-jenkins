# Student API (Spring Boot)

Java 21, Maven, Spring Web. Data is stored temporarily in an ArrayList (no database).

## Run

With Java 21 and Maven installed:

```powershell
mvn spring-boot:run
```

App runs at http://localhost:8081 (8080 is reserved for Jenkins).

## Build

```powershell
mvn clean package
```

JAR is generated under `target/`.

## API

- `POST /students` with JSON `{ "id": 1, "name": "Rahul", "course": "CSE" }`
- `GET /students`
- `GET /students/1`
- `PUT /students/1` with JSON `{ "id": 1, "name": "Rahul", "course": "ECE" }`
- `DELETE /students/1`

This is a beginner demo; it does not persist records or implement production-grade validation and error responses.
