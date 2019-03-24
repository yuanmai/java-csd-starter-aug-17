pipeline {
    agent any

    tools {
        maven 'MAVEN-3.6.0'// 对应 http://Jenkins服务器/configureTools/  页面下的"Maven 安装"
        jdk 'JDK-1.8'         // 对应 http://Jenkins服务器/configureTools/  页面下的"JDK 安装"
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
                sh "mvn sonar:sonar -Dsonar.host.url=http://localhost:9000 -Dsonar.login=99b74c87e136d0a14c834cfb0be671e071066da5"
                // sonar.login 的值对应 http://sonar服务器/account/security/  页面下的"令牌"
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
                timeout(time: 120, unit: 'SECONDS')
            }
            input {
                message "部署到DEV环境？"
                // 在Jenkins Job界面手工审批部署，如果在设定时间内不部署则放弃这一步
            }
            steps {
                sh 'sh scripts/deploy-dev.sh'
            }
        }
        stage('部署到SIT') {
            options {
                timeout(time: 120, unit: 'SECONDS')
            }
            input {
                message "部署到SIT环境？"
                // 在Jenkins Job界面手工审批部署，如果在设定时间内不部署则放弃这一步
            }
            steps {
                sh 'sh scripts/deploy-sit.sh'
            }
        }
        stage('部署到UAT') {
            options {
                timeout(time: 120, unit: 'SECONDS')
            }
            input {
                message "部署到UAT环境？"
                // 在Jenkins Job界面手工审批部署，如果在设定时间内不部署则放弃这一步
            }
            steps {
                sh 'sh scripts/deploy-uat.sh'
            }
        }
    }

    post {
        failure {
            mail to: pipelineParams.Email, subject: '构建失败，请在10分钟内修复', body: "${env.BUILD_URL}"
        }
    }
}
