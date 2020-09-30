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

    public static int[] createAndFeelArrayRandomUnder100 (int sizeArray, int minInt, int maxInt){
        int[] array = new int[sizeArray];
        for (int n = 0; n < array.length; n++) {
            double random0 = Math.random() * 100;
            int random = (int)random0;
            if (random < minInt){
                random = random + minInt;
            } if (random > maxInt){
                random = random - (100 - maxInt);
            }
            array[n] = random;
        }
        return array;
    }

    public static int howManyEvenNumbersInArray (int[] array){
        int i = 0;
        for (int n = 0; n < array.length; n++){
            if (array[n] % 2 == 0){
                i++;
            }
        }
        return i;
    }

    public static int[] splitArray(int[] arr, int start, int end){
        int i = 0;
        int[] split = new int[end - start];
        for (int n = start; n < end; n++){
            split[i] = arr[n];
            i++;
        }
        return split;
    }

    public static int[] copyArray(int[] array){
        int[] copyAr = new int[array.length];
        for (int n = 0; n < array.length; n++){
            copyAr[n] = array[n];
        }
        return copyAr;
    }

    public static int[] copyPartArray (int[] fromArray, int fromIndex, int[] toArray, int toIndex, int size){
        for (int i = 0; i < size; i++){
            toArray[toIndex] = fromArray[fromIndex];
            toIndex++;
            fromIndex++;
        }
        return toArray;
    }

    public static int[] selectSort (int[] array){
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < array.length; n++){
                if (array[n] > array[i]){
                    int a = array[n];
                    array[n] = array[i];
                    array[i] = a;
                }
            }
        }
        return array;
    }

    public static int[] insertSort (int[] array){
        for (int i = 0; i < array.length - 1; i++){
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
        }
        return array;
    }











}