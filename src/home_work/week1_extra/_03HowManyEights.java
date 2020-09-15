package home_work.week1_extra;

import java.util.Scanner;

/*
3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
    5678  -   1
    5889  -   2
    8888  -   4
    989990  - 1
 */
public class _03HowManyEights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int numb = sc.nextInt();
        int result = 0;

        while (numb > 0) {
            if ((numb % 10) == 8) {
            result++;
            }
            numb /= 10;
        }
        System.out.println("Result: " + result);


    }
}
