pipeline{
    agent any
    stages{
        stage("test"){
            steps{
                echo "This stage is Testing ... "
                echo "Current branch is $BRANCH_NAME"
            }
        }
        stage("build"){
            when {
                expression {
                    BRANCH_NAME == 'main'
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
                    BRANCH_NAME == 'main'
                }
            }
            steps{
                echo " This stage is Deploying"
            }
        }
    }
}