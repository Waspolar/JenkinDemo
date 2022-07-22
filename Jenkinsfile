pipeline {
    agent any
    stages{

        stage('SonarQube analysis') {
            steps{
                    withSonarQubeEnv(installationName: 'Sonar9.5', credentialsId: 'sonarqube-token') {
                     sh './gradlew sonarqube \
                     -Dsonar.projectKey=${sonarJenkin} \
                     -Dsonar.host.url=${"http://localhost:9000/projects"} \
                     -Dsonar.login=${sqp_e7da87de564abb367832f0aff0408a6c1d9243d2} \
                     -Dsonar.projectName=${sonarJenkin} \
                     -Dsonar.projectVersion=${"not provided"}'
                    }
    }
  }
}
}
