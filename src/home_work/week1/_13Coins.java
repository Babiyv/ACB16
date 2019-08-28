package home_work.week1;

import java.util.Scanner;

/*
13. Написать программу, которая при вводе числа в диапазоне от 1 до 99
добавляет к нему слово "копейка" в правильной форме. Например, 1
копейка, 5 копеек, 42 копейки .

Подсказка:
    копейка - 1, 21, 31, 41, 51, 61, 71, 81, 91; (заканчивается на 1);
    копейки - 2 - 4, 22 - 24, 32 - 34, 42 - 44, 52 - 54, 92 - 94; (заканчивается на 2-4);
    копеек - все остальное.
 */
public class _13Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 99: ");
        int coin = sc.nextByte();
        int a = (coin % 10);
        System.out.println(a);

        if ( coin < 1 | coin > 99 ) {
            System.out.println("Вы ввели неккоректное число");
        } else if ( coin >= 10 & coin <= 20 ){
            System.out.println( coin + " копеек");
        }
        else if ( a == 1 ) {
            System.out.println( coin + " копейка" );
        }
        else if ( a >= 2 & a <= 4 ) {
            System.out.println( coin + " копейки" );
        }
        else {
            System.out.println( coin + " копеек" );
        }



    }
 }
