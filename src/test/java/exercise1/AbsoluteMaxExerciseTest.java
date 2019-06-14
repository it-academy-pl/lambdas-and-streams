package exercise1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class AbsoluteMaxExerciseTest {

    @Test
    public void testAbsoluteMax() {
        assertEquals(Optional.of(4), AbsoluteMaxExercise.findAbsoluteMax(Arrays.asList(1, -2, 3, -4)));
    }

    @Test
    public void testIfEmpty() {
        assertEquals(Optional.empty(), AbsoluteMaxExercise.findAbsoluteMax(Collections.emptyList()));
    }
}
