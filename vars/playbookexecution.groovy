
def call(Map config = [:]) {
  
  installpackage(name: 'ansible')
  Approval(message: 'Do you want to proceed')
  gitclone(git: "${config.git}")

}
