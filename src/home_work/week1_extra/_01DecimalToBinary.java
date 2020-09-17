package home_work.week1_extra;

import java.util.Scanner;

public class _01DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Перевод числа в двоичную систему:
        System.out.print("Enter a decimal number system: ");
        int i = sc.nextInt();
        System.out.print("In binary system: ");
        while (i != 0) {
            int a = i % 2;
            i /= 2;
            System.out.print(a);
        }
        System.out.println("(сделать вывод в правильном(обратном) порядке)");






    }
}
