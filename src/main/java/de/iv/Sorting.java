package de.iv;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Sorting {

    public static int[] getRandomNumbers(int length, int max, boolean repeating) {
        int[] numbers = new int[length];
        Random random = new Random();
        if (repeating) {
            for (int i = 0; i < length; i++) {
                int r = random.nextInt(1, max);
                numbers[i] = r;
            }
        } else {
            numbers = generateUniqueIntArray(length, 1, max);
        }
        return numbers;
    }

    public static boolean arrayContains(int[] array, int num) {
        return IntStream.of(array).anyMatch(x -> x == num);
    }

    // Chat-GPT begin
    public static int[] generateUniqueIntArray(int size, int minValue, int maxValue) {
        if (size < 0) {
            throw new IllegalArgumentException("Array size must be non-negative.");
        }

        if (maxValue - minValue + 1 < size) {
            throw new IllegalArgumentException("Range of values is not sufficient to generate unique elements.");
        }

        int[] array = new int[size];
        Set<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int number;
            do {
                number = random.nextInt(maxValue - minValue + 1) + minValue;
            } while (uniqueNumbers.contains(number));

            array[i] = number;
            uniqueNumbers.add(number);
        }

        return array;
    }
    // Chat-GPT end

}
