pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'mvn compile'
                echo 'Compiling Project....'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
                echo 'Testing.....'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
