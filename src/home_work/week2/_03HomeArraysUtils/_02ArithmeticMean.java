package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;
import java.util.Scanner;

/*2) Найти среднее арифметическое массива*/
public class _02ArithmeticMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] array = {1, 2, 3, 4, 0};
        ArrayUtils.arithmeticMean(array);

    }
}