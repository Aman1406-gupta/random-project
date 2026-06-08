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

                    REPOSITORY_URL=$(git config --get remote.origin.url)
                    BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD)
                    COMMIT_ID=$(git rev-parse HEAD)
                    TIMESTAMP=$(date -u +"%Y-%m-%dT%H:%M:%SZ")

                    ls -la metadata

                    cat > metadata/suite1-metadata.json <<EOF
        {
          "repositoryUrl": "$REPOSITORY_URL",
          "branchName": "$BRANCH_NAME",
          "commitID": "$COMMIT_ID",
          "buildID": "$BUILD_ID",
          "jobName": "$JOB_NAME",
          "buildUrl": "$BUILD_URL",
          "testReportPath": "build/test-results/suites/Suite1.xml",
          "timestamp_generation": "$TIMESTAMP"
        }
        EOF

                    cat > metadata/suite2-metadata.json <<EOF
        {
          "repositoryUrl": "$REPOSITORY_URL",
          "branchName": "$BRANCH_NAME",
          "commitID": "$COMMIT_ID",
          "buildID": "$BUILD_ID",
          "jobName": "$JOB_NAME",
          "buildUrl": "$BUILD_URL",
          "testReportPath": "build/test-results/suites/Suite2.xml",
          "timestamp_generation": "$TIMESTAMP"
        }
        EOF
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