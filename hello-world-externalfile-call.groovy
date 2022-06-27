job('seed-external-job') {
    scm {
        git('https://github.com/rakeshdyx/JenkinsJobDSL.git')
    }
    steps {
        dsl {
            external ('hello_external.groovy')
        }
    }
}