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
        stage('代码扫描') {
            steps {
                sh "echo mvn sonar:sonar -Dsonar.host.url=http://192.241.210.80:9000"
            }
        }	    
        stage('打包'){
            steps{
                    sh "mvn package -DskipTests"
                    archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
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
		 sh 'scripts/deploy-dev.sh'
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
