FROM openjdk:11
ADD target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway.jar
EXPOSE 8765
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/api-gateway.jar"]
