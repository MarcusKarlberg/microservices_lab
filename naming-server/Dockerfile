FROM openjdk:11
ADD target/naming-server-0.0.1-SNAPSHOT.jar naming-server.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/naming-server.jar"]