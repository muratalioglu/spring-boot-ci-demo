pipeline {
    agent {
        any {
            image 'maven:3.9.5-eclipse-temurin-17-alpine'
            args '-v /root/.m2:/root/.m2'
        }
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