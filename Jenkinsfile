pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Suite Tests') {
            steps {
                sh './gradlew clean runAllTests'
            }
        }

        stage('Collect Metadata') {
            steps {
                sh '''
                    mkdir -p metadata

                    echo BUILD_ID=$BUILD_ID > metadata/build-info.txt
                    echo JOB_NAME=$JOB_NAME >> metadata/build-info.txt
                    echo BUILD_URL=$BUILD_URL >> metadata/build-info.txt

                    git rev-parse HEAD > metadata/commit.txt
                    git rev-parse --abbrev-ref HEAD > metadata/branch.txt
                    git config --get remote.origin.url > metadata/repo.txt
                '''
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: '''
                    build/test-results/suites/*.xml,
                    metadata/*
                '''
            }
        }
    }
}