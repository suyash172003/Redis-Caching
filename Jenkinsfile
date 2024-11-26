pipeline{
  agent any
  stages{
    stage('build'){
      steps{
        sh 'mvn clean install'
      }
    }
    stage('test'){
      steps{
        echo "run th test"
      }
    }
    stage('deploy'){
      steps{
        echo "run the deployement"
      }
    }
  }
}
