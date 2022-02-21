FROM openjdk:11
ADD target/user-service-0.0.1-SNAPSHOT.jar user-service.jar
EXPOSE 8003
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/user-service.jar"]