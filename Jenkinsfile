// #!groovy

pipeline {
    agent any
    Maven mvn = new MavenWrapper(this)
    String jacoco = "org.jacoco:jacoco-maven-plugin:0.8.1"
    tools {
        maven 'apache-maven-3.6.3' 
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
                sh "mvn 'clean package -DskipTests'"
                }
            }
                stage("Tests") {
            steps {
               mvn "${jacoco}:prepare-agent test ${jacoco}:report"
            }
        }
  stage('SonarQube analysis') {
      steps {
    withSonarQubeEnv(credentialsId: '', installationName: 'My SonarQube Server') { // You can override the credential to be used
      sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.6.0.1398:sonar'
      }
    }
  }
     }
 }
