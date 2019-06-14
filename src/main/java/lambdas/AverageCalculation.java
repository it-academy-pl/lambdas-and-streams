package lambdas;

import java.util.List;

public class AverageCalculation implements Calculation {
    @Override
    public double calculate(List<Double> results) {
        Double sum = 0d;

        for (Double nextScore : results) {
            sum += nextScore;
        }
        return sum / results.size();
    }
}
