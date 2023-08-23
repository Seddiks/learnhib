# Use an official OpenJDK image as the base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the Java application JAR file into the container
COPY ./target/learninghibernate-1.0-SNAPSHOT.jar /app/learninghibernate-1.0-SNAPSHOT.jar

# Define the command to run your Java application
CMD ["java", "-jar", "learninghibernate-1.0-SNAPSHOT.jar"]
