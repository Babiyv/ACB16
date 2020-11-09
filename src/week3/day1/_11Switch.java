package week3.day1;

import java.util.Scanner;

public class _11Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
//        так же может принимать в себя и другие типы данных: int, char, String.

        switch (number){
            case 1: // <- аналог if else;
                System.out.println("Do task 1");
//                break; // <- иначе перейдет к следующей строке цикла (case).
            case 2:
                System.out.println("Do task 2");
                break;
            case 3:
                System.out.println("Do task 3");
                break;
            default: // <- аналог else, все что не будет попадать в условие.
                System.out.println("Wrong");
        }
    }
}
