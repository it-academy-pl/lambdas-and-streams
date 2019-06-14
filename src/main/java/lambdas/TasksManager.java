package lambdas;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TasksManager {

    private static List<Double> results = new ArrayList<>();

    private static void populateResults() {
        results.add(30d);
        results.add(31.2);
        results.add(1.2);
        results.add(43.2);
        results.add(31.2);
        results.add(25.2);
    }

    public static void main(String[] args) {
        populateResults();


        Double result = customCalculation(/* we have to add code for calculation here*/ null);

        System.out.println(result);


    }

    public static Double customCalculation(Calculation calculation) {
        return calculation.calculate(results);
    }

}
