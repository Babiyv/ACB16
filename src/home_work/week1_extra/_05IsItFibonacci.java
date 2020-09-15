package home_work.week1_extra;

/*5. Дано натуральное число A > 1. Определите, каким по счету числом Фибоначчи оно является,
                    то есть выведите такое число n, что φn=A.
                    Если А не является числом Фибоначчи, выведите число -1.*/

import java.util.Scanner;

public class _05IsItFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println();

        int f1 = 1;
        int f2 = 1;
        while (f2 <= n){
            int c = f2;
            f2 = f1 + f2;
            f1 = c;
        }

        if ( f1 == n){
            System.out.println("It`s a Fibonacci number");
        } else {
            System.out.println("Not a Fibonacci number");
        }

    }
}
