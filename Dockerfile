FROM openjdk:17
EXPOSE 9090
ADD target/dockerise-spring-boot.jar dockerise-spring-boot.jar
ENTRYPOINT ["java","-jar","/dockerise-spring-boot.jar"]