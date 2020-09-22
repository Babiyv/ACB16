package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;
import java.util.Arrays;
import java.util.Scanner;

/*8) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные*/
public class _08AlmostRandomFeelArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many units in array do you want?");

        int[] array = new int[sc.nextInt()];
        ArrayUtils.almostRandom(array);

        System.out.println(Arrays.toString(array));

    }
}
