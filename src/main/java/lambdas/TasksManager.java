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

        Function<List<Double>, Double> average = results -> {
            Double sum = 0d;
            for (Double nextScore : results) {
                sum += nextScore;
            }
            return sum / results.size();
        };

        Calculation calculation = results -> {
            Double sum = 0d;
            for (Double nextScore : results) {
                sum += nextScore;
            }
            return sum / results.size();
        };
        Double result = customCalculation(calculation);

        System.out.println(result);
        System.out.println("-------------");
        results.stream()
                .map(a -> a*2)
                .peek(System.out::println)
                .filter(a -> a>10)
                .peek(System.out::println)
                .collect(Collectors.toList());


    }

    public static Double customCalculation(Calculation calculation) {
        return calculation.calculate(results);
    }

}
