pipeline {
    agent any
	
  tools {
    maven 'LOCAL_MAVEN'
  }
	
    stages {
        stage('编译') {
            steps {
                 sh 'mvn compile'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
