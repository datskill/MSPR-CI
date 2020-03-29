// #!groovy

pipeline {
    agent any
    tools {
        maven 'maven' 
    }
    stages {
        stage("Code Checkout") {
            steps {
                git branch: 'master',
                url: 'https://github.com/datskill/MSPR-CI.git'
                  }
              }
        stage("Building") {
            steps {
                sh "mvn clean package -DskipTests"
                junit '**/build/test-results/test/*.xml'
                }
            }
          stage('SonarQube analysis') {
      steps {
    withSonarQubeEnv(credentialsId: '', installationName: 'sonarqube') { // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'
      }
    }
  }
        }
}

