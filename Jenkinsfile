def mygvscript
pipeline{
    agent any
    stages{
        stage("prepare"){
            steps{
                script{
                    mygvscript = load "script.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script{
                    mygvscript.buildApp()
                }
            }
        }
        stage("login"){
            steps{
                script{
                    mygvscript.loginApp()
                    }
                }
            }
        }
    }
}