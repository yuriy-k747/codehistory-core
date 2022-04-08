package dev.codehistory.core;

public class ExecutionTime {
    private final long startTime;

    private ExecutionTime() {
        startTime = System.nanoTime();
    }

    public static ExecutionTime start() {
        return new ExecutionTime();
    }

    public long stop() {
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}
