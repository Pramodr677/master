
def call(Map config = [:]) {
  
  sh "sudo apt install ${config.name} -y "
}
