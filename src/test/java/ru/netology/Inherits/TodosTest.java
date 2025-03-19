package ru.netology.Inherits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
    @Test
    public void addTest() {
        Todos todos = new Todos();

        SimpleTask simpleTask = new SimpleTask(1, "простая задача");

        String[] subtasks = { "задача 1", "задача 2" };
        Epic epic = new Epic(2, subtasks);

        Meeting meeting = new Meeting(3, "тема", "проект", "2025-03-11 12:00:00");

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.findAll();
        Task[] expected = { simpleTask, epic, meeting };

        Assertions.assertArrayEquals(actual, expected);
    }

}
