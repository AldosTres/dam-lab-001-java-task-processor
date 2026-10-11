package com.damlab;

import java.util.Optional;
import java.util.Queue;
import java.util.ArrayDeque;

public class TaskManager {
    private final Queue<Task> tasksToDo;

    public TaskManager() {
        this.tasksToDo = new ArrayDeque<>();
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("La tarea añadida no puede ser null");
        }
        this.tasksToDo.offer(task);
    }

    public Optional<Task> getNextTask() {
        Task nextTask = this.tasksToDo.poll();
        return Optional.ofNullable(nextTask);
    }

    public boolean hasTasks() {
        return !this.tasksToDo.isEmpty();
    }
}
