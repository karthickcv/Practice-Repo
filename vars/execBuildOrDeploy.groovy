def call(String command)
 
  if(command == "build")
  {
      pipeline {
          agent any
          stages {
              stage('Build'){
                  steps{
                      echo "Build Pipeline Executed !!!"
                  }
              }
          }
      }
      else if(command == "deploy")
      {
          pipeline {
              agent any
              stages {
                  stage('Deploy') {
                      steps {
                          echo "Deploy Pipeline is Executed !!!"
                      }
                  }
              }
          }
      }

      else
      {
          pipeline {
              agent any
              stages {
                  stage('Do nothing'){
                      steps{
                          echo "Do nothing"
                      }
                  }
              }
          }
      }
  }