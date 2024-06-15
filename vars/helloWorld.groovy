def call(Map config = ['maniteja':'Saturda']) {
    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."
}
