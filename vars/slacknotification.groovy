

def call() {
  slackSend channel: 'channelfor-testing', message: "'Your ${env.JOB_NAME} is suceesful. Its build number and build url are  ${env.BUILD_NUMBER} and ${env.BUILD_URL}.'"
}  
