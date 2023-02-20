def buildApp(){
    sh 'ls -l'
    sh 'docker build -t techwithnc/image:4.0 .'
    sh 'docker image ls'
}
def testApp(){
    echo 'this is testApp ....'
}
def deployApp(){
    echo 'this is deployApp ....'
}
return this