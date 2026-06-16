//pipeline {
//    agent any
//
//    stages {
//        stage('Checkout') {
//            steps {
//                checkout scm
//            }
//        }
//
//        stage('Run Suite Tests') {
//            steps {
//                sh './gradlew clean runAllTests'
//            }
//        }
//
//        stage('Collect Build Metadata') {
//            steps {
//                sh '''
//                REPORT_DIR="build/test-results/suites"
//                METADATA_DIR="metadata"
//
//                mkdir -p "$METADATA_DIR"
//
//                if [ ! -d "$REPORT_DIR" ]; then
//                    echo "WARNING: Report directory $REPORT_DIR not found. Skipping metadata generation."
//                    exit 0
//                fi
//
//                REPOSITORY_URL=$(git config --get remote.origin.url || echo "unknown")
//                BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD || echo "unknown")
//                COMMIT_SHA=$(git rev-parse HEAD || echo "unknown")
//                TIMESTAMP_GENERATION=$(date -u +"%Y-%m-%dT%H:%M:%SZ")
//
//                for report_file in "$REPORT_DIR"/*.xml; do
//
//                    [ -f "$report_file" ] || continue
//                    SUITE_NAME=$(basename "$report_file" .xml)
//
//                    echo "Generating metadata for: $SUITE_NAME"
//
//                    cat > "$METADATA_DIR/${SUITE_NAME}-metadata.json" <<EOF
//{
//  "repositoryUrl": "$REPOSITORY_URL",
//  "branchName": "$BRANCH_NAME",
//  "commitSha": "$COMMIT_SHA",
//  "buildID": "$BUILD_ID",
//  "jobName": "$JOB_NAME",
//  "buildUrl": "$BUILD_URL",
//  "testReportPath": "$report_file",
//  "timestamp_generation": "$TIMESTAMP_GENERATION"
//}
//EOF
//                done
//
//                echo "=== Successfully Generated $(ls -1 "$METADATA_DIR" | wc -l) Metadata Files ==="
//                '''
//            }
//        }
//
//        stage('Archive Reports') {
//            steps {
//                archiveArtifacts artifacts: 'build/test-results/suites/*.xml, metadata/*.json'
//            }
//        }
//    }
//}

pipeline {
    agent any

    environment {
        REPORT_DIR = "build/test-results/test"
        OUTPUT_DIR = "build/test-results"
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

        stage('Generate Suite XML') {
            steps {
                sh '''
                mkdir -p "$SUITE_DIR"

                python3 scripts/generate_suite_xml.py \
                    "$REPORT_DIR" \
                    "$SUITE_DIR"
                '''
            }
        }

        stage('Generate Build Metadata') {
            steps {
                sh '''
                mkdir -p "$METADATA_DIR"

                BUILD_UUID=$(uuidgen)

                REPOSITORY_URL=$(git config --get remote.origin.url)
                BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD)
                COMMIT_SHA=$(git rev-parse HEAD)

                TIMESTAMP_GENERATION=$(date -u +"%Y-%m-%dT%H:%M:%SZ")

                cat > "$METADATA_DIR/build-metadata.json" <<EOF
{
  "buildID":"$BUILD_UUID",
  "repositoryUrl":"$REPOSITORY_URL",
  "branchName":"$BRANCH_NAME",
  "commitSha":"$COMMIT_SHA",
  "jobName":"$JOB_NAME",
  "buildUrl":"$BUILD_URL",
  "timestampGeneration":"$TIMESTAMP_GENERATION"
}
EOF
                '''
            }
        }

        stage('Generate Test Info') {
            steps {
                sh '''
                python3 scripts/generate_test_info.py \
                    "$METADATA_DIR/test-info.json"
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