
package com.damlab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class TaskProcessorTest {

    @Test
    public void shouldReturnProcessedTasksInFifoOrder() {
        TaskManager manager = new TaskManager();

        Task task1 = new Task("Backup", "Crear una copia de seguridad", null);
        Task task2 = new Task("Copy", "Crear una copia de texto", null);

        manager.addTask(task1);
        manager.addTask(task2);

        TaskProcessor processor = new TaskProcessor(manager);

        List<Task> processedTasks = processor.processAllTasks();

        Assertions.assertEquals(2, processedTasks.size());
        Assertions.assertSame(task1, processedTasks.get(0));
        Assertions.assertSame(task2, processedTasks.get(1));
    }
}
