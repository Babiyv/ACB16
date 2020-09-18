package utils;

import java.util.Arrays;

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

    public static void arithmeticMean(int[] array){
        int am = 0;
        for (int a = 0; a < array.length; a++){
            am = am + array[a];
        }
        System.out.println("Arithmetic mean of " + Arrays.toString(array) + " is: " + am);
    }


}