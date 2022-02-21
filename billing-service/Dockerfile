FROM openjdk:11
ADD target/billing-service-0.0.1-SNAPSHOT.jar billing-service.jar
EXPOSE 8006
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/billing-service.jar"]