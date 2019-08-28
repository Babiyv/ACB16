package home_work.week1;

import java.util.Scanner;

/*
15. Известны площади круга и квадрата. Определить:
а) уместится ли круг в квадрат;
б) уместится ли квадрат в круге.
 */
public class _15SquareAndCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter circle surface: ");
        int circle = sc.nextInt();
        System.out.println("Enter square surface: ");
        int square = sc.nextInt();

        int r = (int)( Math.sqrt ((circle / 3.514) + (circle % 3.514)) );
        int a = (int) Math.sqrt(square);
//        System.out.println( "r = " + r + ". a = " + a );

        if ( ( r * 2 ) > a &
                a <= ( (int)Math.sqrt(2) * r ) ) {
            System.out.println("a): No. Circle can`t fit inside square.");
            System.out.println("b): Yes, square can fit inside circle");
        } else if (  ( r * 2 ) <= a &
                a > ( (int)Math.sqrt(2) * r ) ) {
            System.out.println("a): Yes. Circle can fit inside square.");
            System.out.println("b): No, square can`t fit inside circle");
        } else {
            System.out.println("a): No. Circle can`t fit inside square.");
            System.out.println("b): No, square can`t fit inside circle");
        }





    }
}
