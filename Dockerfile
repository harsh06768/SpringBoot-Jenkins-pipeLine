FROM openjdk:8
EXPOSE 9090
ADD target/springboot-jenkins-pipeline-docker.jar springboot-jenkins-pipeline-docker.jar
ENTRYPOINT ["java","-jar","/springboot-jenkins-pipeline-docker.jar"]
