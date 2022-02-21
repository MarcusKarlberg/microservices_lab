FROM openjdk:11
ADD target/exchange-service-0.0.1-SNAPSHOT.jar exchange-service.jar
EXPOSE 8008
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/exchange-service.jar"]