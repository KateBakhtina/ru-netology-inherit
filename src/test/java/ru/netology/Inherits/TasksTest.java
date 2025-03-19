package ru.netology.Inherits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.provider.CsvFileSource;

public class TasksTest {

    @Test
    public void searchTest() {
        Todos todos = new Todos();

        SimpleTask simpleTask = new SimpleTask(001, "simple task");

        String[] subtasks = { "first task", "second task", "third task" };
        Epic epicTask = new Epic(002, subtasks);

        Meeting meetingTask = new Meeting(003, "main topic", "interesting project", "date and time");

        todos.add(simpleTask);
        todos.add(epicTask);
        todos.add(meetingTask);

        Task[] actual = todos.search("task");
        Task[] expected = { simpleTask, epicTask };
        Assertions.assertArrayEquals(actual, expected);

        Task[] actualPartSearch = todos.search("ting");
        Task[] expectedPartSearch = { meetingTask };
        Assertions.assertArrayEquals(actualPartSearch, expectedPartSearch);

    }
}
