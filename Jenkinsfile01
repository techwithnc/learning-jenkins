def gv
pipeline{
    agent any
    stages{
        stage("init"){
            steps{
                script{
                    gv = load "script.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script{
                    gv.buildApp()
                }
            }
        }
        stage("test"){
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage("deploy"){
            input{
                message "Choose this"
                ok "Done"
                parameters{
                    choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
                    choice(name: 'ENV', choices: ['test', 'dev', 'prod'], description: '')
                    choice(name: 'CLOUD', choices: ['aws', 'azure', 'gcp'], description: '')
                }
            }
            steps{
                script{
                    gv.deployApp()
                    echo "Deploying ${VERSION}"
                    echo "Deploying ${ENV}"
                    echo "Deploying ${CLOUD}"
                }
            }
        }
    }
}