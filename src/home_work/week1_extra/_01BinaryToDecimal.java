package home_work.week1_extra;

import java.util.Scanner;

/*
1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот.
Пользователь сам вводит число
 */
public class _01BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int i = sc.nextInt();

// Перевод числа в двоичную систему:
        for (; i != 0 ;) {
//            System.out.println(i);
            int a = i % 2;
            i /= 2;
            System.out.println("a: " + a);
        }


        









    }
}
