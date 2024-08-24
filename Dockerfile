#start with a base image containing java run time
FROM openjdk:17-jdk-slim


#set the working directory in the container
WORKDIR /app

#copy the executable JAR file from the host to the container
copy target/orderpayment-service.jar /app/orderpayment-service.jar


# Expose the port on which the application will run
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "orderpayment-service.jar"]