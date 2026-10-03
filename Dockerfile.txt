# Use official Java runtime as base image
FROM eclipse-temurin:21-jre-alpine

# Set working directory in container
WORKDIR /app

# Copy the application files to the container
# Update this to match your build artifact (e.g., JAR file location)
COPY target/*.jar app.jar

# Expose port (update this to match your application's port)
EXPOSE 8080

# Set the entry point to run the Java application
ENTRYPOINT ["java", "-jar", "app.jar"]