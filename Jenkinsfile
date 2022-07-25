pipeline {
    agent any
    stages{

        stage('SonarQube analysis') {
            steps{
                    withSonarQubeEnv(installationName: 'Sonar9.5', credentialsId: 'sonarqube-token') {
                     sh './gradlew sonarqube \
                     -Dsonar.projectKey=${sonarJenkin} \
                     -Dsonar.host.url=${"http://localhost:9000/projects"} \
                     -Dsonar.login=${sqp_2a697d0f01138da73dc6a19424ce47ea848de2e4} \
                     -Dsonar.projectName=${sonarJenkin} \
                     -Dsonar.projectVersion=${"not provided"}'
                    }
    }
  }
}
}
