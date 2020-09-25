package home_work.week2._04Loops;
/*4.4. Последовательность Фибоначчи определяется так: φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
 По данному числу n определите n-е число Фибоначчи φn.
 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 237. */

import java.util.Scanner;

public class _04FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What number of Fibonacci numbers do you want to know?");
        int n = sc.nextInt();
        while (n <= 0){
            System.out.println("Invalid number. Please enter bigger  than 0...");
            System.out.println("What number of Fibonacci numbers do you want to know?");
            n = sc.nextInt();
        }
        int f1 = 0;
        int f2 = 1;
        int fibonacci = 1;
        for (int i = 0; i < n; i++){
            fibonacci = f1 + f2;
            f2 = f1;
            f1 = fibonacci;
        }
        System.out.println("Number " + n + " is: φ" + fibonacci);
    }
}
