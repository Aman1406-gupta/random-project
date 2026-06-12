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

        stage('Collect Build Metadata') {
            steps {
                sh '''
                REPORT_DIR="build/test-results/suites"
                METADATA_DIR="metadata"

                mkdir -p "$METADATA_DIR"

                if [ ! -d "$REPORT_DIR" ]; then
                    echo "WARNING: Report directory $REPORT_DIR not found. Skipping metadata generation."
                    exit 0
                fi

                REPOSITORY_URL=$(git config --get remote.origin.url || echo "unknown")
                BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD || echo "unknown")
                COMMIT_SHA=$(git rev-parse HEAD || echo "unknown")
                TIMESTAMP_GENERATION=$(date -u +"%Y-%m-%dT%H:%M:%SZ")

                for report_file in "$REPORT_DIR"/*.xml; do

                    [ -f "$report_file" ] || continue
                    SUITE_NAME=$(basename "$report_file" .xml)

                    echo "Generating metadata for: $SUITE_NAME"

                    cat > "$METADATA_DIR/${SUITE_NAME}-metadata.json" <<EOF
{
  "repositoryUrl": "$REPOSITORY_URL",
  "branchName": "$BRANCH_NAME",
  "commitSha": "$COMMIT_SHA",
  "buildID": "$BUILD_ID",
  "jobName": "$JOB_NAME",
  "buildUrl": "$BUILD_URL",
  "testReportPath": "$report_file",
  "timestamp_generation": "$TIMESTAMP_GENERATION"
}
EOF
                done

                echo "=== Successfully Generated $(ls -1 "$METADATA_DIR" | wc -l) Metadata Files ==="
                '''
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: 'build/test-results/suites/*.xml, metadata/*.json'
            }
        }
    }
}