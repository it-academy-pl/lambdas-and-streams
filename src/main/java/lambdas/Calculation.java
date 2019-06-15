package lambdas;

import java.util.Collections;
import java.util.List;

@FunctionalInterface
public interface Calculation {
    Double calculate(List<Double> results);

}
