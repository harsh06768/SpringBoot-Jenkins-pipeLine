FROM openjdk:8
EXPOSE 9090
ADD targets/springboot-jenkins-pipeline-docker.jar springboot-jenkins-pipeline-docker
ENTRYPOINT ["java","-jar","/springboot-jenkins-pipeline-docker.jar"]

