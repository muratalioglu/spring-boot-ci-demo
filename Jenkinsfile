pipeline {
    agent any
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