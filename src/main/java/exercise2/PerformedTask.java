package exercise2;

public class PerformedTask {
    private int id;
    private Task task;
    private String studentName;
    private double calculatedResult;

    public PerformedTask(int id, Task task, String studentName, double calculatedResult) {
        this.id = id;
        this.task = task;
        this.studentName = studentName;
        this.calculatedResult = calculatedResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getCalculatedResult() {
        return calculatedResult;
    }

    public void setCalculatedResult(double calculatedResult) {
        this.calculatedResult = calculatedResult;
    }

    public boolean isTaskPassed() {
        double expected = task.getExpectedResult();
        double marginOfError = task.getMarginOfError();
        double min = expected-expected/marginOfError;
        double max = expected+expected/marginOfError;
        if(calculatedResult<max && calculatedResult>min) {
            return true;
        }
        return false;
    }
}
