package home_work.week1_extra;

import java.util.Scanner;

/*
1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот.
Пользователь сам вводит число
 */
public class _01BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary system number: ");
// Разделение числа(строки) на отдельные цифры(составляющие) с записью в отдельные ячейки массива:
/*
        int number = sc.nextInt();
        int[] array = number.split(""); // <- метод split работал пока типа данных был String, а не int;
        System.out.println("Визуализатор: " + array[1]); // визуализатор для себя, потом снести!

*/
// Перевод числа в десятичную систему умножением предыдущего итога на 2:
/*      *прим - исходное число 100011*
        0*2+1=1
        1*2+0=2
        2*2+0=4
        4*2+0=8
        8*2+1=17
        17*2+1=35
 */
//      счетчик выбора ячейки:
 /*       for (int i = 0; i != array.length; i++){
            int z = 0;
            int n = array[i];
            int res = z * 2 + n;
            System.out.println(i);
        }

*/
    }
}
