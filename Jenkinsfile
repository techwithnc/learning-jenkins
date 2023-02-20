pipeline{
    agent any
    stages{
        stage("test"){
            steps{
                echo "This stage is Testing ... "
                echo "Current build no. is ${env.BUILD_NUMBER}"
            }
        }
        stage("build"){
            when {
                expression {
                    env.BRANCH_NAME == 'main'
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
                    env.BRANCH_NAME == 'main'
                }
            }
            steps{
                echo " This stage is Deploying"
            }
        }
    }
}