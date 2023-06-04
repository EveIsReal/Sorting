package de.iv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = Sorting.getRandomNumbers(100, 100, false);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}