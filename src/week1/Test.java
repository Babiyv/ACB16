package week1;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int number_create;
        if (number<0){ //делаем число положительным
            number *=-1;
        }
        System.out.println(number);
        for (;number>0;number /=10){
            number_create = number%10;
        }



    }
}
