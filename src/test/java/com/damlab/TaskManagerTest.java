package com.damlab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TaskManagerTest {

    @Test
    public void shouldReportTasksAfterAddingOne() {
        TaskManager manager = new TaskManager();

        Task task = new Task(
                "Backup",
                "Crear una copia de seguridad",
                null
        );

        manager.addTask(task);

        Assertions.assertTrue(manager.hasTasks());
    }

    @Test
    public void shouldReportNoTasksWhenCreated() {
        TaskManager manager = new TaskManager();

        Assertions.assertFalse(manager.hasTasks());
    }

    @Test
    public void shouldReturnNextTaskAdded() {
        TaskManager manager = new TaskManager();
        Task task = new Task(
                "Backup",
                "Crear una copia de seguridad",
                null
        );

        manager.addTask(task);

        Assertions.assertEquals(Optional.of(task), manager.getNextTask());
    }

    @Test
    public void shouldReturnTasksInFifoOrder() {
        TaskManager manager = new TaskManager();
        Task task = new Task(
                "Backup",
                "Crear una copia de seguridad",
                null
        );
        Task task2 = new Task(
                "Copy",
                "Crear una copia de texto",
                null
        );

        manager.addTask(task);
        manager.addTask(task2);

        Assertions.assertEquals(Optional.of(task), manager.getNextTask());
        Assertions.assertEquals(Optional.of(task2), manager.getNextTask());
    }

    @Test
    public void shouldReturnEmptyOptionalWhenNoTasksExist() {
        TaskManager manager = new TaskManager();

        Assertions.assertEquals(
                Optional.empty(),
                manager.getNextTask()
        );
    }

    @Test
    public void shouldRejectNullTask() {
        TaskManager manager = new TaskManager();

        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> manager.addTask(null)
        );
    }
}
