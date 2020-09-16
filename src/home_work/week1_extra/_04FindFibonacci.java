package home_work.week1_extra;

/*4. Последовательность Фибоначчи определяется так:
      φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
     По данному числу n определите n-е число Фибоначчи φn.*/

import java.util.Scanner;

public class _04FindFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number > 0: ");
        int n = sc.nextInt();
        System.out.println();

        int f = 1;
        int f0 = 0;
        int f1 = 1;
        int a = 1;
        while (a <= n){
            f = f0 + f1;
            f1 = f0;
            f0 = f;
            a++;
        }
        if (n > 0)
        System.out.println("Number " + n + " is: φ" + f);
        else
            System.out.println("Invalid number!");




    }
}
