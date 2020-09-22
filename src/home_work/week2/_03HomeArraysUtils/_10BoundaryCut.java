package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;
import java.util.Arrays;

/*10) public static int[] splitArray(int[] arr, int start, int end) { // обрезать массив по границам start и end }*/
public class _10BoundaryCut {
    public static void main(String[] args) {

        int[] array = ArrayUtils.createAndFillArray(10);
        System.out.println(Arrays.toString(array));
        int[] split = ArrayUtils.splitArray(array, 2, 8);
        System.out.println(Arrays.toString(split));
    }
}
