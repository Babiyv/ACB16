package home_work.week1;

import java.util.Scanner;

/*
4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
*/
public class _04NumberWithFloatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number with floating point and we will check it - ");

        double a = sc.nextDouble();

        if  (a < 0 | a > 1) System.out.println("Sorry, invalid number...");
        else if  (a >= 0 | a <= 1) System.out.println("All is Ok!");


    }
}
