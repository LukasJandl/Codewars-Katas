package sort_the_odd_test;
import com.codecool.sort_the_odd.OddNumberSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberSorterTest {

    OddNumberSorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new OddNumberSorter();
    }

    @Test
    @DisplayName("Sort the odd")
    void testSort() {
        int[] input1 = {7,1};
        int[] output1 = {1, 7};
        int[] input2 = {5, 8, 6, 3, 4};
        int[] output2 = {3, 8, 6, 5, 4};
        int[] input3 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] output3 = {1, 8, 3, 6, 5, 4, 7, 2, 9, 0};
        assertEquals(Arrays.toString(output1), Arrays.toString(sorter.sort(input1)));
        assertEquals(Arrays.toString(output2), Arrays.toString(sorter.sort(input2)));
        assertEquals(Arrays.toString(output3), Arrays.toString(sorter.sort(input3)));
    }
}