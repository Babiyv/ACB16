package home_work.week2._06Extra;

import utils.ArrayUtils;

import java.util.Arrays;

/* 	6.3 Написать свой метод arraycopy, аналогичный методу System.arraycopy.*/
public class _03ArrayCopyMethod {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
//        System.arraycopy(a, 0, b, 0, 4);
        ArrayUtils.copyPartArray(a, 0, b, 0, 4);
        System.out.println(Arrays.toString(b));
    }
}

// сам метод, чтобы меньше искать:
/*  public static int[] arrayCopyPart (int[] fromArray, int fromIndex, int[] toArray, int toIndex, int size){
        for (int i = 0; i < size; i++){
            toArray[toIndex] = fromArray[fromIndex];
            toIndex++;
            fromIndex++;
        }
        return toArray;
    }*/
