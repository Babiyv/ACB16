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

    public static void findNumberInArray(int[] array){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number that you need to find in array: ");
        int number = sc.nextInt();
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

}