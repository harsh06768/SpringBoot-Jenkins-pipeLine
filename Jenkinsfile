pipeline {
    agent any
    
    environment {
        
        imagename = "harsh8848/springboot-jenkins-pipeline-docker.jar"
        registryCredential = 'harsh8848'
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
        
        
        stage('Deploy Image') {
             steps{
                script {
                    docker.withRegistry( '', registryCredential ) {
                    dockerImage.push("$BUILD_NUMBER")
                    dockerImage.push('latest')
                     }
                 }
             }
         }
    }
}
