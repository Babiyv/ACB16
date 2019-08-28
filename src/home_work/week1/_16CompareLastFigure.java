package home_work.week1;

import java.util.Scanner;

/*
16. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
        			124    4    -   true
        			1456   567  -   false
        			1      2    -   false
        			18     98   -   true
 */
public class _16CompareLastFigure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number - ");
        int first = sc.nextInt();
        System.out.println("Please enter second number - ");
        int second = sc.nextInt();

        int a = (int) (first % 10);
        int b = (int) (second % 10);

        if (first < 0 & second >= 0 |
            first >= 0 & second < 0) {
            System.out.println("Both numbers must be positive or negative at the same time...");
        } else if ( a == b ) {
            System.out.println("Congrad, last figures of both numbers are equal!");
        } else {
            System.out.println("Sorry, last figures of this numbers aren`t equal...");
        }



    }
}
