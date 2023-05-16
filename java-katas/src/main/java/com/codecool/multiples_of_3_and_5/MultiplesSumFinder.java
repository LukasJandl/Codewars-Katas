package com.codecool.multiples_of_3_and_5;

import java.util.ArrayList;
import java.util.List;

public class MultiplesSumFinder {
    private final int FIRST_DIVISOR = 3;
    private final int SECOND_DIVISOR = 5;
    private List<Integer> multiples;

    public MultiplesSumFinder() {
        this.multiples = new ArrayList<>();
    }
    public int sumOfMultiplesOf3Or5(int number) {
        if (number < 0) {
            return 0;
        }
        for (int i = 0; i < number; i++) {
            if (i%FIRST_DIVISOR == 0 || i%SECOND_DIVISOR == 0) {
                multiples.add(i);
            }
        }
        return multiples.stream().reduce(0, Integer::sum);
    }
}
