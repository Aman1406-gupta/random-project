pipeline {
    agent any

    environment {
        REPORT_DIR = "build/test-results/test"
        SUITE_DIR = "build/test-results/suites"
        METADATA_DIR = "build/test-results/metadata"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run Tests') {
            steps {
                sh './gradlew clean test'
            }
        }

        stage('Generate Test Info') {
            steps {
                sh '''
                mkdir -p "$METADATA_DIR"
                python3 scripts/generate_test_info.py
                '''
            }
        }

        stage('Generate Suite XML') {
            steps {
                sh '''
                mkdir -p "$SUITE_DIR"
                
                export BUILD_UUID=$(uuidgen)
                export REPOSITORY_URL=$(git config --get remote.origin.url || echo "unknown")
                export BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD || echo "unknown")
                export TIMESTAMP_GENERATION=$(date -u +"%Y-%m-%dT%H:%M:%SZ")

                python3 scripts/generate_suite_xml.py \
                    "$REPORT_DIR" \
                    "$SUITE_DIR"
                '''
            }
        }

        stage('Archive Artifacts') {
            steps {
                archiveArtifacts artifacts: '''
                    build/test-results/suites/*.xml,
                    build/test-results/metadata/*.json
                '''
            }
        }
    }
}