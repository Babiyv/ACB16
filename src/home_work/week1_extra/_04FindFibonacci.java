package home_work.week1_extra;

/*4. Последовательность Фибоначчи определяется так:
      φ0=0,  φ1=1, ..., φn=φn-1+φn-2.
     По данному числу n определите n-е число Фибоначчи φn.*/

import java.util.Scanner;

public class _04FindFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f0 = 0;
        int f1 = 1;
        while (f0 < 257){
            int f = f0 + f1;
            f1 = f0;
            f0 = f;
            System.out.println(f);
        }




    }
}
