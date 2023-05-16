package isogram_test;

import com.codecool.isogram.IsogramChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IsogramCheckerTest {
    IsogramChecker isogramChecker = new IsogramChecker();

    public static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(true, new String ("")),
                Arguments.of(false, new String ("aba")),
                Arguments.of(false, new String ("moose")),
                Arguments.of(true, new String ("Dermatoglyphics")),
                Arguments.of(true, new String ("abcdefghijklmnopqrstuvwxyz")),
                Arguments.of(false, new String ("aidufewöfIP")),
                Arguments.of(false, new String ("isIsogram")),
                Arguments.of(false, new String ("moOse")),
                Arguments.of(false, new String ("Aa"))
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void findShouldReturnUniqueValue(boolean check, String word) {
        Assertions.assertEquals(check, isogramChecker.isIsogram(word));
    }
}
