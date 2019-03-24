pipeline {
    agent any
    stages {
        stage('编译') {
            steps {
                mvn compile
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
