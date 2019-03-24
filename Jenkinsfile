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
                ok "是的"
                submitter "alice,bob"
                parameters {
                    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
                }
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
