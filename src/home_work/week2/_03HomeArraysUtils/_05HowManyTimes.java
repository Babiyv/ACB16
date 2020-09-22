package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;

import java.util.Scanner;

/*5) Посчитать сколько раз цифра(цифра задается пользователем) встречается в  случайно сгенерированом массиве*/
public class _05HowManyTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number that you need to find in array: ");
        int number = sc.nextInt();
        int [] array = ArrayUtils.createAndFillArray(6);
        ArrayUtils.findNumberInArray(array, number);

    }
}
