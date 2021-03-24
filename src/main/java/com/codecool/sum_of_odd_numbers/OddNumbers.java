package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        int oddNumbersCounter = 0;
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbersCounter++;
            }
        }
        if (oddNumbersCounter == 0) return 0;
        else return numbers.stream().filter(oddNumbers -> oddNumbers % 2 != 0).mapToInt(Integer::intValue).sum();

    }
}