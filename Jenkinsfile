pipeline {
    agent any
    
    environment {
        
        imagename = "harsh8848/springboot-jenkins-pipeline-docker"
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
        
          stage('Packaging') {
            steps {
                bat 'mvn package'
                echo 'Packaging.....'
                echo 'JAR file  Successfully created'
            }
        }
        
        
       // docker build . -t app-springboot
        
       stage('Building image') {
            steps{
                script {
                     dockerImage = docker build . -t imagename 
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
