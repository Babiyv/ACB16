package home_work.week1;

import java.util.Scanner;

/*
14. Определить, является ли шестизначное число "счастливым" (сумма
первых трех цифр равна сумме последних трех цифр).
 */
public class _14FortuneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check your number (6 figures in number): ");
        int numb = sc.nextInt();

        if ( numb < 100000 | numb > 999999 ) {
            System.out.println("Please enter number with 6 figures. Example: 123456");
        }

        int a = ( numb / 100000 % 10);
        int b = ( numb / 10000 % 10);
        int c = ( numb / 1000 % 10);
        int d = ( numb / 100 % 10);
        int e = ( numb / 10 % 10);
        int f = ( numb % 10);

        int comp1 = ( a + b + c);
        int comp2 = ( d + e + f);

//      как прописать защиту от чисел короче 6 знаков (при этом воспринимало число 000001) и от бесконечного количества 0 (000000000000000)?
        if (comp1 == comp2) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sorry, maybe next time...");
        }




    }
}
