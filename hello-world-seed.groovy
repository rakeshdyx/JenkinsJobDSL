job('seed-inline-job') {
    steps {
        dsl {
        text("""
            job("hello-world") {
            steps {
                shell("echo Hello World!")
              }
            }""")
        }
    }
}