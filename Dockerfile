# Use an official OpenJDK runtime as a parent image

FROM eclipse-temurin:17-jdk

# Set a variable for the JAR file name
ARG JAR_FILE=target/hostela.jar

# Set the working directory
 WORKDIR /app

# Copy the application's jar to the container
COPY ${JAR_FILE} hostela.jar

# Expose the application port
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/hostela.jar"]