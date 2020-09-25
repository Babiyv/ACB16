package home_work.week2._04Loops;

import java.util.Scanner;

/*4.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер:
    5678  -   1;
    5889  -   2;
    8888  -   4;
    989990  - 1.*/
public class _03HowManyEight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        int counter = 0;
        int mod;

        while (number > 0){
            mod = number % 10;  // <- checking/"scanning" last digit;
            if (mod == 8) {
                counter++;
            }
            number /= 10;   // <- "deleting" last digit;
        }

        if (counter > 0){
            System.out.println("Counter: " + counter);
        } else {
            System.out.println("No 8`s  in your number...");
        }

    }
}
