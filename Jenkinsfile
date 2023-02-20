pipeline{
    agent any
    environment {
        CURRENT_STAGE = 'build'
    }
    stages{
        stage("test"){
            steps{
                echo "This stage is Testing ... "
                echo "Current build no. is ${env.BUILD_NUMBER}"
                echo "Current stage is ${CURRENT_STAGE}"
            }
        }
        stage("build"){
            when {
                expression {
                    env.CURRENT_STAGE == 'build'
                }
            }
            steps{
                echo " This stage is Building...."
                sh 'cat file.txt'
            }
        }
        stage("deploy"){
            when {
                expression {
                    env.CURRENT_STAGE == 'deploy'
                }
            }
            steps{
                echo " This stage is Deploying"
            }
        }
    }
}