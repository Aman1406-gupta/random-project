package com.sprinklr.randomproject.listener;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TimestampExecutionListener implements TestExecutionListener {

    private static final Map<String, String> timestamps = new ConcurrentHashMap<>();

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan){
        timestamps.clear();
    }

    @Override
    public void executionStarted(TestIdentifier testIdentifier) {
        if (!testIdentifier.isTest()) {
            return;
        }

        String key = testIdentifier.getUniqueId();
        timestamps.put(key, Instant.now().toString());
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        try {
            String outFile = System.getProperty("timestamp.output.file");
            if (outFile == null || outFile.isBlank()) {
                return;
            }

            Path output = Path.of(outFile);
            Files.createDirectories(output.getParent());

            ObjectMapper mapper = new ObjectMapper();
            mapper.writerWithDefaultPrettyPrinter().writeValue(output.toFile(), timestamps);

        } catch (Exception e) {
            throw new RuntimeException("Failed to generate timestamp file", e);
        }
    }
}