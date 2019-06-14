package exercise2;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TaskUtils {

    public List<PerformedTask> getAllPassedTasks(List<PerformedTask> performedTasks) {
        return performedTasks.stream().filter(p -> p.isTaskPassed()).collect(Collectors.toList());
    };

    List<Task> getAllTasksPerformedAtLeastOnce(List<PerformedTask> performedTasks) {
        return performedTasks.stream().map(performedTask -> performedTask.getTask()).distinct().collect(Collectors.toList());
    }

    public List<Task> getTasksSolveCorrectlyAtLeastOnce(List<PerformedTask> performedTasks) {
        return performedTasks.stream()
                .filter(performedTask -> performedTask.isTaskPassed())
                .map(performedTask -> performedTask.getTask())
                .distinct()
                .collect(Collectors.toList());
    };


}
