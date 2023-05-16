package com.codecool.find_the_unique_number;

public class UniqueNumberFinder {
    public double find(double[] arrayWithUniqueNumber) {
        double firstValue = arrayWithUniqueNumber[0];
        double secondValue = arrayWithUniqueNumber[1];
        double thirdValue = arrayWithUniqueNumber[2];
        double uniqueValue = 0;

        if (firstValue == secondValue) {
            for (int i = 2; i < arrayWithUniqueNumber.length; i++) {
                if (arrayWithUniqueNumber[i] != firstValue) {
                    uniqueValue = arrayWithUniqueNumber[i];
                    break;
                }
            }
        } else if (firstValue == thirdValue) {
            uniqueValue = secondValue;
        } else{
            uniqueValue = firstValue;
        }
        return uniqueValue;
    }
}
