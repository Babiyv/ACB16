package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;

import java.util.Arrays;

/*4) Заданы два массива одинаковой длинны с любыми значениями скопировать данные из первого массива во второй*/
public class _04CopyArray {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        array2 = ArrayUtils.copyArray(array1);

        System.out.println(Arrays.toString(array2));

    }
}
