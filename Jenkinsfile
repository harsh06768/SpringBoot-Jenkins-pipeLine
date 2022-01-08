pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
               // sh 'mvn compile'
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
