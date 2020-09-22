package utils;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtils {

//    public static <return_data_type><name(verb)>(<input_data>)
//    public static void <name(verb)>(<input_data>) -> if nothing return - void
//    public static <return_data_type><name(verb)>()

    public static int[] createAndFillArray(int size){
//        logic
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void arithmeticMeanArray(int[] array){
        int am = 0;
        for (int a = 0; a < array.length; a++){
            am = am + array[a];
        }
        System.out.println("Arithmetic mean of " + Arrays.toString(array) + " is: " + am);
    }

    public static void findMinAndMaxInArray(int[] array){
        int min = 1;
        int max = 0;
        for (int n = 0; n < array.length; n++){
            if (min > array[n]){
                min = array[n];
            }
            if  (max < array[n]){
                max = array[n];
            }
        }
        System.out.println("Min is: " + min + "; Max is: " + max + ".");
    }

    public static void swapMinMaxInArray(int[] array){
        int min = 1;
        int max = 0;
        int nMin = 0;
        int nMax = 0;
        for (int n = 0; n < array.length; n++){
            if (min > array[n]){
                min = array[n];
                nMin = n;
            }
            if  (max < array[n]){
                max = array[n];
                nMax = n;
            }
        }
        int n = array[nMin];
        array[nMin] = array[nMax];
        array[nMax] = n;
        System.out.println("array[" + nMin + "]: " + array[nMin]);
        System.out.println("array[" + nMax + "]: " + array[nMax]);
    }

    public static void findNumberInArray(int[] array, int number){
        Scanner sc = new Scanner(System.in);
        int calc = 0;
        for (int n = 0; n < array.length; n++) {
            if (array[n] == number) {
                calc++;
            }
        }
        if (calc == 1){
            System.out.println("Integer " + number + " occurs in array: " + calc + " time.");
        } else if (calc > 1) {
            System.out.println("Integer " + number + " occurs in array: " + calc + " times.");
        } else {
            System.out.println("Nothing found...");
        }
    }

    public static void whichHalfOfArrayIsBigger (int[] array){
        int n = 0;
        int half1 = 0;
        int half2 = 0;
        while (n < array.length / 2){
            half1 = half1 + array[n];
            n++;
        }
        while (n < array.length){
            half2 += array[n];
            n++;
        }
        if (half1 > half2){
            System.out.print("First half of array is bigger: {");
            for (int a = 0; a < array.length / 2; a++){
                System.out.print(", " + array[a]);
            }
            System.out.print("};");
        } else if (half1 < half2){
            System.out.print("Second half of array is bigger: {");
            for (int a = array.length / 2; a < array.length; a++){
                System.out.print(", " + array[a]);
            }
            System.out.print("};");
        } else if (half1 == half2) {
            System.out.println("Half of array " + Arrays.toString(array) + " is equal.");
        }
    }

    public static int[] sumUnitsOfArrays (int[] array1, int[] array2){
        int[] sum = new int [array1.length];
        for (int i = 0; i < array1.length; i++){
            sum[i] = array1[i] + array2[i];
        }
        return sum;
    }

    public static int[] almostRandom (int[] array){
        for (int i = 0; i < array.length; i++){
            double random1 = Math.random() * 100;
            int random = (int)random1;
            array[i] = random;
            if (i % 2 == 0 & array[i] % 2 != 0){
                array[i]++;
            } if (i % 2 != 0 & array[i] % 2 == 0){
                array[i]++;
            }
        }
        return array;
    }












}