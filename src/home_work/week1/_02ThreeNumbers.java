package home_work.week1;

import java.util.Scanner;

/*
2. Пользователь вводит три числа с консоли,
нужно вывести на консоль наибольшее, наименьшее.
 */
public class _02ThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Hello, master Jenja!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Please enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Please enter third number: ");
        int num3 = sc.nextInt();
        int max;
        int min;


        if ( num1 >= num2 & num1 >= num3) max = num1;
        else if ( num2 >= num1 & num2 >= num3) max = num2;
        else max = num3;

        if ( num1 <= num2 & num1 <= num3) min = num1;
        else if ( num2 <= num1 & num2 <= num3) min = num2;
        else min = num3;

        System.out.println("The biggest one is " + max +  ". The smaller one is " + min);

        }
}
