FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-ms-customer/target/pbd-ms-customer-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","app.jar"]