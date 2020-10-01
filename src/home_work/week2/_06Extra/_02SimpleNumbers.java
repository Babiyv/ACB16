package home_work.week2._06Extra;

import java.util.Scanner;

/*6.2 Проверить или является число простым*/
public class _02SimpleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for checking: ");
        int number = sc.nextInt();

        if (number <= 0){
            System.out.println("Simple number must be bigger than 1...");
        }
        else if (number == 1){
            System.out.println("Mathematics still can`t say is 1 a simple number or not...");
        }
        else {
            int a;
            int b = 5;
            for (int i = 2; i < b; i++) {
                a = number % i;
                if (i != number & a == 0) {
                    b = 6;
                    i = b + 1;
                    System.out.println("not simple");
                }
            }
            if (b != 6) {
                System.out.println("simple");
            }
        }
    }
}
