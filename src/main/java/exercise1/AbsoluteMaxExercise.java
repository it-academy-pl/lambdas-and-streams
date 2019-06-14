package exercise1;

import java.util.Collection;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class AbsoluteMaxExercise {

    public static Optional<Integer> findAbsoluteMax(Collection<Integer> input) {
        return input.stream()
                .map(absolute)
                .reduce(maxFinder);
    }
    private static Function<Integer, Integer> absolute = value -> Math.abs(value);

    private static BinaryOperator<Integer> maxFinder = (a, b) -> Math.max(a,b);
}
