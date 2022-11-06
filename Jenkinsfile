pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
               sh ssh -i "/var/lib/jenkins/mumbai.pem" -o StrictHostKeyChecking=no -tt ubuntu@52.3.222.48 "ansible-playbook -e 'foo=${FOO}' -i Invnetory ~/frontplay.yml"
            }
        }
    }
}
