FROM openjdk:11
ADD target/location-service-0.0.1-SNAPSHOT.jar location-service.jar
EXPOSE 8005
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/location-service.jar"]