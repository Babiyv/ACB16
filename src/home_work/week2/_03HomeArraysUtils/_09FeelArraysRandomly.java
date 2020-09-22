package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;

import java.util.Arrays;

/*9) Задать два массива случайными числами от 25 до 75. Определить у какого из массивов больше парных елементов.*/
public class _09FeelArraysRandomly {
    public static void main(String[] args) {

        int[] arr1 = ArrayUtils.createAndFeelArrayRandomUnder100(5, 25, 75);
        int[] arr2 = ArrayUtils.createAndFeelArrayRandomUnder100(5, 25, 75);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int evenNumbers1 = ArrayUtils.howManyEvenNumbersInArray(arr1);
        int evenNumbers2 = ArrayUtils.howManyEvenNumbersInArray(arr2);
        if (evenNumbers1 > evenNumbers2){
            System.out.println("In first array more even numbers.");
        } else if (evenNumbers1 < evenNumbers2){
            System.out.println("In second array more even numbers.");
        } else {
            System.out.println("Equal quantity of even numbers in both arrays.");
        }

    }
}
