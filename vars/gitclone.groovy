
def call(Map config = [:]) {
  git branch : 'main' , url: "${config.git}"
}
