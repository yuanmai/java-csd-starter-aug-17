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
        stage('单元测试') {
            steps {
                 sh 'mvn test'
            }
        }
        stage('DEV') {
            input {
                message "部署到DEV环境？"
            }		
            steps {
		 sh 'echo hhh'
            }
        }	    
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
