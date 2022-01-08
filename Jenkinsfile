pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                sh 'compile'
                echo 'Compiling Project....'
            }
        }
        stage('Test') {
            steps {
                sh 'test'
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
