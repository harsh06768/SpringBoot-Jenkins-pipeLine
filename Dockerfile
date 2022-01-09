FROM openjdk:8
EXPOSE 9090
#COPY target/springboot-jenkins-pipeline-docker.jar /opt/springboot-jenkins-pipeline-docker/lib/springboot-jenkins-pipeline-docker.jar
ADD target/springboot-jenkins-pipeline-docker.jar springboot-jenkins-pipeline-docker.jar
ENTRYPOINT ["java","-jar","/springboot-jenkins-pipeline-docker.jar"]
