package week2.day1;

import utils.ArrayUtils;

public class _07ArrayCreation {
    public static void main(String[] args) {
        int size = 5;
        int [] numbers = ArrayUtils.createAndFillArray(size);

        String[] names = {"Nastja", "Lida", "Sergej", "Natasha", "Alex", "Dima"};

        ArrayUtils.printArray(numbers);
        ArrayUtils.printArray(names);


    }
}
