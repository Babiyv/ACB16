package home_work.week1;

import java.util.Scanner;

/*
7. Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
пара равных
 */
public class _07IsEqual {
    public static void  main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter  number A - ");
        double a = sc.nextDouble();
        System.out.println("Please enter  number B - ");
        double b = sc.nextDouble();
        System.out.println("Please enter  number C - ");
        double c = sc.nextDouble();

        if (a == b & a == c) System.out.println("A, B and C are equal");
        else if (a == b) System.out.println("A and B are equal");
        else if (c == b) System.out.println("C and B are equal");
        else if (a == c) System.out.println("A and C are equal");
        else System.out.println("Sorry, no equal parameters");
    }
}
