# STAGE 1: Build the application using a Maven image
FROM maven:3.9.6-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Compile the code and package it into a .jar file
RUN mvn clean package -DskipTests
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
# Copy ONLY the built .jar file from the 'builder' stage
COPY --from=builder /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]