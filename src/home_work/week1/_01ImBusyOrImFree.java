package home_work.week1;
/*
1. Пользователь вводит параметр с консоли (текущий час от 0 до 24).
Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
*/

import java.util.Scanner;

public class _01ImBusyOrImFree {
    public static void main(String[] args) {
        System.out.println("Hello, master Jenja!");
     Scanner sc = new Scanner (System.in);

        System.out.println("Please hour from 0 to 24 : ");
        byte hour = sc.nextByte(); //специально сделал тип данных байт для "облегчения", не нужно специально вводить сильно большое число))

        if ( hour < 0 | hour > 24 ) {
            System.out.println("Please try again and enter correct hour from 0 to 24!");
        } else if ( hour >= 9 & hour < 18 ) {
                System.out.println("I`m at work now");
        } else {
                System.out.println("Sorry, I`m chilling");
        }
    }
}
