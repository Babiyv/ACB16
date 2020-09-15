package home_work.week1_extra;

/*2. Вычислить факториал числа.*/

import java.util.Scanner;

public class _02Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number: ");
        int enterNumber = sc.nextInt();
        System.out.println(); // перенос на следующую строку;

        int [] array = new int [enterNumber+1]; // +1 - чтобы не было нулевой ячейки иначе, при умножениее на ноль, все накроется;
//        заполнение ячеек массива:
        for (int i = 1; i < array.length; i++){
            array[i] = i;
        }

//        int factorial = array[1] * array[2] * array [3] * ... :
        int factorial = 1;
        for (int a = 1; a < array.length; a++){
            factorial = factorial * array[a];
        }

        System.out.println("Factorial of " + enterNumber + " is: " + factorial);
    }
}
