package com.codecool.sort_the_odd;

public class OddNumberSorter {
    public int[] sort(int[] toSort) {
        int temp;
        for (int i = 0; i < toSort.length; i++) {
            for (int j = i + 1; j < toSort.length; j++) {
                if (toSort[i]%2 != 0) {
                    if (toSort[j]%2 != 0 && toSort[i] > toSort[j]) {
                        temp = toSort[i];
                        toSort[i] = toSort[j];
                        toSort[j] = temp;
                    }
                }
            }
        }
        return toSort;
    }
}
