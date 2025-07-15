# Java Project

A sample Java project using Maven for build management.

## Project Structure

```
├── pom.xml                 # Maven configuration file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── Main.java    # Main application class
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── MainTest.java # Test class
└── README.md
```

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Building and Running

### Compile the project
```bash
mvn compile
```

### Run the application
```bash
mvn exec:java
```

### Run tests
```bash
mvn test
```

### Package the application
```bash
mvn package
```

### Clean build artifacts
```bash
mvn clean
```

## Getting Started

1. Make sure you have Java 17+ and Maven installed
2. Navigate to the project directory
3. Run `mvn compile` to compile the project
4. Run `mvn exec:java` to execute the main class
5. Run `mvn test` to execute the tests

## IDE Setup

This project can be imported into any Java IDE that supports Maven:
- IntelliJ IDEA
- Eclipse
- Visual Studio Code (with Java extensions)

The IDE should automatically recognize the Maven project structure and configure the classpath accordingly.
