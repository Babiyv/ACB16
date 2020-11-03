package week3;

import utils.ArrayUtils;

public class _04TestSort {
    public static void main(String[] args) {
        int[] numbers = ArrayUtils.createRandomArray(10, 0, 100);
        ArrayUtils.printArray(numbers);
//        ArrayUtils.sort(numbers);
        for (int j = numbers.length; j > 0; j--) {
            for (int i = 0; i < j - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
//                swap
                    int tmp = numbers[i];
                    numbers[i] = numbers[i + i];
                    numbers[i + 1] = tmp;
                }
            }
        }
        ArrayUtils.printArray(numbers);
    }
}