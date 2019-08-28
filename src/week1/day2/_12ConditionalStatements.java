package week1.day2;

import java.util.Scanner;

public class _12ConditionalStatements {
    public static void main(String[] args) {
        String name = "Vlad";
        int pass = 123456;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password ");
        int enteredPass = sc.nextInt();

//          if true -> do logic
        boolean isEqual = pass == enteredPass;
        if(isEqual){
//          logic
            System.out.println("Enter successful, welcome " + name + "!");
        } else {
//          logic
            System.out.println("Sorry, wrong password");
        }
    }
}
