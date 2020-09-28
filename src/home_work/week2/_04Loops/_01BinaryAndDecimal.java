package home_work.week2._04Loops;

import java.util.Scanner;

/*4.1. Перевод с числа с десятичной системы счисления в двоичную, и наоборот. Пользователь сам вводит число.*/
public class _01BinaryAndDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("If you need convert binary to decimal - enter \"1\"");
        System.out.println("If you need convert decimal to binary - enter \"2\"");
        System.out.print("Make your choose 1 or 2: ");
        int start = sc.nextInt();

        if (start == 1){
//            from binary to decimal:
            System.out.print("Enter a binary number: ");
            int number = sc.nextInt();

            int n = 0; // <- size of array in future;
            for (int i = number; i > 0; n++, i /= 10); // <- calculate necessary size of array;
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++){ // <- start of positional notation method conversion bin to dec;
                n--;
                array[i] = (int)Math.pow(2, n);
            }
            int sum = 0;
            int b = number;
            for (int i = array.length - 1; i > -1; i--){
                array[i] *= (b % 10);
                sum += array[i];
                b /= 10;
            }
            System.out.println("Your binary number " + number + " in decimal is: " + sum);
        }
        else if (start == 2){
//            from decimal to binary:
            System.out.print("Enter a decimal number: ");
            int number = sc.nextInt();
            System.out.print("Decimal " + number + " in binary is: ");

            int answer = 0;
            int i = 0;
            while (number > 0){ // <- loop from decimal to binary conversion;
                answer = (answer * 10) + (number % 2);
                number /= 2;
                i++;
            }
            int[] array = new int[i];   // <- system.out answer in reverse (correct) pattern;
            for (int n = 0; n < array.length; n++){
                array[n] = answer % 10;
                answer /= 10;
                System.out.print(array[n]);
            }
        } else {
            System.out.println("Invalid number");
        }


    }
}
