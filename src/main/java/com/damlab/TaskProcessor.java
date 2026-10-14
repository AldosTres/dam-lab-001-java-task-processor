package com.damlab;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskProcessor {
    private final TaskManager manager;
    private final List<Task> processedTasks;

    public TaskProcessor(TaskManager manager) {
        this.manager = manager;
        this.processedTasks = new ArrayList<Task>();
    }

    public List<Task> processAllTasks() {
        List<Task> processedTasks = new ArrayList<>();

        while (this.manager.hasTasks()) {
            Task taskToProcess = this.manager.getNextTask().orElseThrow();

            this.processTask(taskToProcess);
            processedTasks.add(taskToProcess);
        }

        return processedTasks;
    }

    public void processTask(Task task) {
        // TODO: implementar el procesamiento real en el futuro.
    }
}
