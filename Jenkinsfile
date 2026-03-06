pipeline {
    agent any

    tools {
        maven 'Maven_3.9'
        jdk 'JDK_17'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/EkambeSachin/swagLabs_Selenium.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Publish Reports') {
            steps {
                publishHTML([reportDir: 'target/surefire-reports',
                             reportFiles: 'index.html',
                             reportName: 'TestNG Report'])
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}