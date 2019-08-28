package home_work.week1;

import java.util.Scanner;

/*
5. Ввести с клавиатуры значения трех сторон треугольника a, b и c и определить, является ли он прямоугольным.
Ответ вывести в виде сообщения.
 */
public class _05RectangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter side a - ");
        int a = sc.nextInt();
        System.out.println("Please enter side b - ");
        int b = sc.nextInt();
        System.out.println("Please enter side c - ");
        int c = sc.nextInt();

        if (a * a == b * b + c * c |
                b * b == a * a + c * c |
                c * c == a * a + b * b) {
            System.out.println("Yep, it`s rectangle!");
        } else {
            System.out.println("Sorry, but it`s not rectangle...");
        }

    }
}
