package exercise2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class TaskUtilsTest {
    private List<PerformedTask> performedTasks = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    Task task1;
    Task task2;
    PerformedTask performedTask1;
    PerformedTask performedTask2;
    PerformedTask performedTask3;

    @Before
    public void setUp() {
    
        task1 = new Task(1, "task 1", 5, 20d);
        task2 = new Task(1, "task 2", 10, 100d);
        tasks.add(task1);
        tasks.add(task2);

        performedTask1 = new PerformedTask(1, task1, "Marian", 10d);
        performedTask2 = new PerformedTask(2, task1, "Marian", 19d);
        performedTask3 = new PerformedTask(3, task2, "Marian", 10d);
        performedTasks.add(performedTask1);
        performedTasks.add(performedTask2);
        performedTasks.add(performedTask3);
    }

    @Test
    public void getAllPassedTasks() {
        //assertThat(taskUtils.getAllPassedTasks(performedTasks)).containsExactly(performedTask2);

        List<PerformedTask> passedTasks = new ArrayList<>();
        passedTasks.add(performedTask2);
        assertEquals(passedTasks, TaskUtils.getAllPassedTasks.apply(performedTasks)); //result type check - list?
    }

    @Test
    public void getTasksPerformedAtLeastOnce() {
        //assertThat(taskUtils.getAllTasksPerformedAtLeastOnce(performedTasks)).containsExactly(task1, task2);

        List<Task> tasksPerformedAtLeastOnce = new ArrayList<>();
        tasksPerformedAtLeastOnce.add(task1);
        tasksPerformedAtLeastOnce.add(task2);
        assertEquals(tasksPerformedAtLeastOnce, TaskUtils.getAllTasksPerformedAtLeastOnce.apply(performedTasks));
    }

    @Test
    public void getTasksSolvedCorrectlyAtLeastOnce() {
        //assertThat(taskUtils.getTasksSolveCorrectlyAtLeastOnce(performedTasks)).containsExactly(task1);

        List<Task> tasksSolvedCorrectlyAtLeastOnce = new ArrayList<>();
        tasksSolvedCorrectlyAtLeastOnce.add(task1);
        assertEquals(tasksSolvedCorrectlyAtLeastOnce, TaskUtils.getTasksSolveCorrectlyAtLeastOnce.apply(performedTasks));
    }

    @Test
    public void getTasksNotSolvedCorrectlyEvenOnce() {
        //assertThat(taskUtils.getTasksSolveCorrectlyAtLeastOnce(performedTasks)).containsExactly(task1);

        List<Task> tasksNotSolvedCorrectlyEvenOnce = new ArrayList<>();
        tasksNotSolvedCorrectlyEvenOnce.add(task2);
        List<Task> tasksSolvedCorrectlyAtLeastOnce = TaskUtils.getTasksSolveCorrectlyAtLeastOnce.apply(performedTasks);

        assertEquals(tasksNotSolvedCorrectlyEvenOnce, tasks.stream().filter(e -> !tasksSolvedCorrectlyAtLeastOnce.contains(e)).collect(Collectors.toList()));
    }

}