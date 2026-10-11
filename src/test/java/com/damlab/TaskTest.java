package com.damlab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TaskTest {
    @Test
    public void shouldReturnTaskName() {

        Task task = new Task(
                "Backup",
                "Crear una copia de seguridad",
                "Evitar la pérdida de información");

        String taskName = task.getName();
        Assertions.assertEquals("Backup", taskName);
    }

    @Test
    public void shouldReturnTaskDescription() {
        Task task = new Task("Backup", "Crear una copia de seguridad", "Evitar la pérdida de información");
        String taskDescription = task.getDescription();
        Assertions.assertEquals("Crear una copia de seguridad", taskDescription);
    }

    @Test
    public void shouldReturnTaskPurpose() {
        Task task = new Task("Backup", "Crear una copia de seguridad", "Evitar la pérdida de información");

        Assertions.assertEquals(Optional.of("Evitar la pérdida de información"), task.getPurpose());
    }

    @Test
    public void shouldRejectTaskWithBlankName() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task("", "Crear una copia de seguridad", null));
    }

    @Test
    public void shouldRejectTaskWithNullName() {

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Task(null, "Crear una copia de seguridad", null));

    }

    @Test
    public void shouldRejectTaskWithNullDescription() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Task("Backup", null, null)
        );
    }

    @Test
    public void shouldReturnEmptyOptionalWhenPurposeIsNull() {
        Task task = new Task("Backup", "Crear una copia de seguridad", null);
        Assertions.assertEquals(Optional.empty(), task.getPurpose());
    }


    @Test
    public void shouldRejectTaskWithBlankDescription() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Task("Backup", "   ", null)
        );
    }
}

