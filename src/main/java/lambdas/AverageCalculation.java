package lambdas;

import java.util.List;

public class AverageCalculation implements Calculation {
    @Override
    public Double calculate(List<Double> results) {
        Double result = 0d;
        for(Double element: results) {
            result += element;
        }
        return result/results.size();
    }
}
