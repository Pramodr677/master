
def call(Map config = [:]) {
  slackSend channel: "${config.channel}", message: "job $JOB_NAME build number $BUILD_NUMBER and build url $BUILD_URL  started build "
}
