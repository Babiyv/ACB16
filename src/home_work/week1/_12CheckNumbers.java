package home_work.week1;

import java.util.Scanner;

/*
12. Дано трехзначное число. Определить:
    а) верно ли, что все его цифры одинаковые;
    б) есть ли среди его цифр одинаковые.
 */
public class _12CheckNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 000 to 999: ");

        int numb  = sc.nextInt();
        int a = numb / 100;
//        System.out.println("a: " +a);
        int b = (int)(numb % 100 * 0.1);
//        System.out.println("b: " +b);
        int c = numb % 10; // хер пойми как я это сделал, аналогично как и строку выше. Образно говоря тыцькал как на обум и выводил результат...(
//        System.out.println("c: " + c);

//   как добавить защиту от ввода не трехзначных чисел? например программа позволяет ввести "1", и расшифровует аналогично вводу "001"
        if ( numb < 000 | numb > 999) {
            System.out.println("Invalid number, please check and try again.");
        }
        else if ( a == b & b == c) {
            System.out.println("a): Yes, all figures are equal!");
            System.out.println("b): Yes, all of them are equal");
        } else if (( a == b & b != c ) |
                ( a == c & c != b ) |
                ( b == c & c != a )) {
            System.out.println("a): No, not all figures are equal.");
            System.out.println("b): Yes, two figures are equal");
        } else if ( a != b & a != c & c != b ) {
            System.out.println("a): No, not all figures are equal.");
            System.out.println("b): No, there is no equal figures");
        }
    }
}
