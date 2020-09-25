package home_work.week2._04Loops;

import java.util.Scanner;

/*4.2. Вычислить факториал числа.
    5! = 1 * 2* 3 * 4 * 5 = 120; */
public class _02Factorial {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial *= i;
        }
        System.out.println("Factorial of " + number+ "! is: " + factorial);
    }
}
