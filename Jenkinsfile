pipeline {
    agent any
   

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
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
