package exercise2;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskUtils {

    static Function<List<PerformedTask>, List<PerformedTask>> getAllPassedTasks = results ->
            results.stream().filter(element -> element.isTaskPassed()).collect(Collectors.toList());


    static Function<List<PerformedTask>, List<Task>> getAllTasksPerformedAtLeastOnce = results ->
            results.stream().map(element -> element.getTask()).distinct().collect(Collectors.toList());


    static Function<List<PerformedTask>, List<Task>> getTasksSolveCorrectlyAtLeastOnce = results ->
            results.stream().filter(element -> element.isTaskPassed()).map(element -> element.getTask()).distinct().collect(Collectors.toList());



}
