FROM openjdk:11
ADD target/booking-service-0.0.1-SNAPSHOT.jar booking-service.jar
EXPOSE 8002
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/booking-service.jar"]