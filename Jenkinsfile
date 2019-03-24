pipeline {
    agent any
    stages {
        stage('编译') {
            steps {
                withMaven(maven: '(Default)') { 
                        if(isUnix()) {
                            sh "mvn compile " 
                        } else { 
                            bat "mvn compile " 
                        } 
                    } 
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again!'
        }
    }
}
