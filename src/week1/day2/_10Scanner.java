package week1.day2;

import java.util.Scanner;

public class _10Scanner {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your name is - " + name + ". Your age - " +age);
    }
}
