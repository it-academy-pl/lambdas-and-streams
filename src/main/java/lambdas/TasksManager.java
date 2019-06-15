package lambdas;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TasksManager {

    private static List<Double> results = new ArrayList<>();

    private static void populateResults() {
/*        results.add(30d);
        results.add(31.2);
        results.add(1.2);
        results.add(43.2);
        results.add(31.2);
        results.add(25.2);*/
    }

    public static void main(String[] args) {
        populateResults();


        Function<List<Double>, Double> averageCalculation = results -> {
            Double result = 0d;
            for(Double element: results) {
                result += element;
            }
            return result/results.size();
        };

        //Double result = customCalculation(averageCalculation);

        //System.out.println(result);
        Optional<Double> maxOptional = results.stream().reduce((a, b) -> Math.max(a,b));

        
        if(maxOptional.isPresent()) {
            System.out.println(maxOptional.get());
        } else {
            System.out.println("some problem occured");
        }


    }

    public static Double customCalculation(Function<List<Double>, Double> function) {
        return function.apply(results);
    }

}
