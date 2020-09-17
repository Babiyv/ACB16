package week2.day1;

import java.util.Scanner;

public class _06MethodsIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        int pow = 4;

        /*int res = number;
        for (int i = 1; i < pow; i++) {
            int oper = res * number;
            res = oper;
        }
        System.out.println(res);*/

        number = (int)Math.pow(number, pow);
        System.out.println(number);




    }
}
