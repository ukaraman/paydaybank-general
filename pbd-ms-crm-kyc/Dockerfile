FROM openjdk:8-jdk-alpine
ARG JAR_FILE=pbd-ms-crm-kyc/target/pbd-ms-crm-kyc-*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod","app.jar"]