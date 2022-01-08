pipeline {
    agent any
    
    environment {
        imagename = "springBoot-jenkins-pipeline-docker"
        //registryCredential = 'kevalnagda'
        dockerImage = ''
    }
   

    stages {
        stage('Build') {
            steps {
              
               // bat 'mvn -Dmaven.test.failure.ignore=true clean' 
                bat 'mvn compile' 
                echo 'Compiling Project....'
                echo 'Compiled Successfully'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
                echo 'Testing.....'
                echo 'Tested Successfully'
            }
        }
       stage('Building image') {
            steps{
                script {
                     dockerImage = docker.build imagename
                }
            }
        }
    }
}
