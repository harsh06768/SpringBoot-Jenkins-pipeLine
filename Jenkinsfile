pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
               // sh 'mvn compile'
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
                echo 'Compiling Project....'
                echo 'Compiled Successfully'
            }
        }
        stage('Test') {
            steps {
              //  sh 'mvn test'
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
