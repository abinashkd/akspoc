FROM openjdk:8-jdk-alpine
COPY /target/poc-0.0.1-SNAPSHOT.jar app.jar
RUN chmod 777 app.jar
ENTRYPOINT ["java","-jar","app.jar"]