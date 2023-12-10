pipeline {
    agent { label 'linux' }
    tools {
        maven '3.9.6'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn -DskipTests install'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}