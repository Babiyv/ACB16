package home_work.week1;

import java.util.Scanner;

/*
3. Пользователь вводит число. Вывести на экран его удвоенное значение,если число делится на 7 нацело.
*/
public class _03ShowDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number - ");
        double a  = sc.nextDouble();
        double res1 = a % 7;

        if  (res1 <= 0) System.out.println("Result - " + ((int)a * 2));
        else System.out.println("Sorry, but this number can`t been segmented on 7 without a decimal numbers.");

//      чет не до конца осознаю как я это сделал))) есть какая-то неуверенность в отношении деления чисел в java...
    }
}
