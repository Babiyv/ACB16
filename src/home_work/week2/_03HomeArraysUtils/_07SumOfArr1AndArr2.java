package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;

import java.util.Arrays;

/*7) Есть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива, который получается в результате суммы arr1[i] + arr2[i]*/
public class _07SumOfArr1AndArr2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] arr3 = ArrayUtils.sumUnitsOfArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }
}
