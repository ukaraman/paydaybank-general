FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-ms-communication/target/pbd-ms-communication-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","app.jar"]