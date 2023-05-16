package find_the_unique_number_test;

import com.codecool.find_the_unique_number.UniqueNumberFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class UniqueNumberFinderTest {
    private UniqueNumberFinder uniqueNumberFinder = new UniqueNumberFinder();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(2, new double[] { 1, 1, 1, 2, 1, 1 }),
                Arguments.of(0.55, new double[] { 0, 0, 0.55, 0, 0 }),
                Arguments.of(-6.3, new double[] { -6.3, 4.2, 4.2, 4.2, 4.2, 4.2, 4.2, 4.2, 4.2 }),
                Arguments.of(346, new double[] { 4.2, 346, 4.2, 4.2, 4.2, 4.2, 4.2, 4.2, 4.2 })
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findShouldReturnUniqueValue(double number, double[] array) {
        Assertions.assertEquals(number, uniqueNumberFinder.find(array));
    }


}