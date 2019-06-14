package exercise2;

public class Task {
    private int id;
    private String description;
    private double marginOfError;
    private double expectedResult;

    public Task(int id, String description, int marginOfError, double expectedResult) {
        this.id = id;
        this.description = description;
        this.marginOfError = marginOfError;
        this.expectedResult = expectedResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMarginOfError() {
        return marginOfError;
    }

    public void setMarginOfError(double marginOfError) {
        this.marginOfError = marginOfError;
    }

    public double getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(double expectedResult) {
        this.expectedResult = expectedResult;
    }

}
