package multiples_of_3_and_5_test;

import com.codecool.multiples_of_3_and_5.MultiplesSumFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplesSumFinderTest {
    private MultiplesSumFinder multiplesSumFinder = new MultiplesSumFinder();

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "-5, 0",
            "-567, 0",
            "1, 0",
            "2, 0",
            "3, 0",
            "4, 3",
            "5, 3",
            "6, 8",
            "10, 23",
            "13, 45",
            "20, 78",
            "200, 9168"
    })
    void calculatesPhraseLength(int number, int sumOfMultiples) {
        Assertions.assertEquals(sumOfMultiples, multiplesSumFinder.sumOfMultiplesOf3Or5(number));
    }
}
