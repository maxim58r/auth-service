FROM openjdk:21-jdk
COPY target/auth-service.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
