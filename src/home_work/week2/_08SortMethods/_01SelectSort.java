package home_work.week2._08SortMethods;

import utils.ArrayUtils;

import java.util.Arrays;

public class _01SelectSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 1, 4};
        ArrayUtils.selectSort(array);
        /*for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array.length; n++){
                if (array[n] > array[i]){
                    int a = array[n];
                    array[n] = array[i];
                    array[i] = a;
                }
            }
        }*/
        System.out.println(Arrays.toString(array));

    }
}
