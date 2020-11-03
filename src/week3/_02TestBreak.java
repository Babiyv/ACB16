package week3;

import java.util.Scanner;


public class _02TestBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // - сканнер в этом месте ломал программу (переспрашивала только неправильно введенное значение).

        int pass = 123456;
        String name = "admin";
// break - заканчивает/ прекращает выполнение кода (например в цикле).
// return - заканчивает/ прекращает выполнение дальнейшего кода и выходит из самого метода(из "public static ***", а не просто из цикла).
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter login");
            String inputLogin = sc.nextLine();
            System.out.println("Enter pass");
            int inputPass = sc.nextInt();
            if (name.equals(inputLogin) && pass == inputPass) break;
//            if (name.equals(inputLogin) && pass == inputPass) return; - заканчивает/ прекращает выполнение дальнейшего кода и выходит из метода (public static ***).
            System.out.println("Wrong login or email");
        }
        System.out.println("Log in");

    }
}



