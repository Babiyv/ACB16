package home_work.week2._08SortMethods;

import utils.ArrayUtils;
import java.util.Arrays;

public class _02InsertSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        ArrayUtils.insertSort(array);
        /*for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                int a = array[i];
                array[i] = array[i+1];
                array[i + 1] = a;
                for (int n = 0; n < i; n++){
                    if (array[n] > array[i]){
                        int b = array[n];
                        array[n] = array[i];
                        array[i] = b;
                    }
                }
            }
        }*/
        System.out.println(Arrays.toString(array));
    }
}
