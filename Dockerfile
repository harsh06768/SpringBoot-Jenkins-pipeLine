FROM openjdk:8
EXPOSE 9090
ADD target/SpringBoot-Jenkins-pipeLine-docker.jar SpringBoot-Jenkins-pipeLine-docker
ENTRYPOINT ["java","-jar","/SpringBoot-Jenkins-pipeLine-docker.jar"]