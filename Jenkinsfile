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
        stage('部署到DEV') {
           options {
              timeout(time: 30, unit: 'SECONDS') 
           }		
            input {
                message "部署到DEV环境？"
            }		
            steps {
		 sh 'echo deploy to dev'
            }
        }	
        stage('部署到SIT') {
           options {
              timeout(time: 30, unit: 'SECONDS') 
           }		
            input {
                message "部署到SIT环境？"
            }		
            steps {
		 sh 'echo deploy to sit'
            }
        }	
        stage('部署到UAT') {
           options {
              timeout(time: 30, unit: 'SECONDS') 
           }		
            input {
                message "部署到UAT环境？"
            }		
            steps {
		 sh 'echo deploy to uat'
            }
        }	    
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
