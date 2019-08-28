package home_work.week1;

import java.util.Scanner;
/*
17. Посчитать сколько раз встречается символ 5 в заданном числе, которое вводит юзер (число трехкратное)
  435  -   1
  505  -   2
  555  -   3
  305  -   1
 */
public class _17FindFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter number with three figures: ");
        int number = sc.nextInt();

        if (number < 100 | number > 999) {
            System.out.println("Invalid number... It must contain only 3 figures.");
        } else {
            int a = (number / 100 % 10);
            int b = (number / 10 % 10);
            int c = (number % 10);

            int counter = 0;

            if (a == 5) {
                counter++;
            }

            if (b == 5) {
                counter++;
            }

            if (c == 5) {
                counter++;
            }

            if (counter == 3) {
                System.out.println("Wow! This number is 555!");
            } else if (counter > 0 && counter < 3) {
                System.out.println("Figure 5 only " + counter + " time" + (counter > 1 ? "s" : "") + " in this number.");
            } else {
                System.out.println("No figure 5 in this number...");
            }
        }
    }
}