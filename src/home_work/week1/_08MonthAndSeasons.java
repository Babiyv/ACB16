package home_work.week1;

import java.util.Scanner;

/*
8. Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
времени года. Если пользователь введет недопустимое число, программа
должна выдать сообщение об ошибке.
 */
public class _08MonthAndSeasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter numerous of your month (from 1 to 12) - ");
        double month = sc.nextDouble();
        double check = month % 1;

        if (check > 0 | month < 1 | month > 12) System.out.println("Please enter correct information...");
        else if (month >= 1 & month <=2 | month > 11) System.out.println("Winter is come!");
        else if (month >= 3 & month <=5) System.out.println("Spring is outside, time for love)");
        else if (month >= 6 & month <=8) System.out.println("Summer!!! Party time!");
        else if (month >= 9 & month <=11) System.out.println("Time for warm tea and blanket or go to the Bali! Winter is coming...");


    }

}
