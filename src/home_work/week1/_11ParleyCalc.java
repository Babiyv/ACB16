package home_work.week1;

import java.util.Scanner;

/*
11. Написать программу вычисления стоимости переговоров, если по суббо-
там и воскресеньям предоставляется 20% скидка. Ввести продолжитель-
ность разговора и день недели (цифра от 1 до 7).
 */
public class _11ParleyCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = 600;
        System.out.println("Please enter which of the day in week it was (from 1 to 7): ");
            int day = sc.nextInt();
/*      if (day < 1 | day > 7 ){
            System.out.println("Sorry, invalid information");
        } - как сделать чтобы при невыполнении этого условия в этом месте программа не переходила дальше на следующий этап???
*/
        System.out.println("Please enter how many hours parley was been: ");
            double hours = sc.nextDouble();

        double parst = (price * hours); //parst - parley standard, standard price without discount.
        double pardis = ((price - price * 0.2) * hours); //pardis - parley discount, price with discount.

        if ( day < 1 | day > 7 |
            hours <= 0 | hours > 24) {
            System.out.println("Sorry, please check entered information");
        } else if ( day >= 1 & day <= 5 ) {
            System.out.println("Total price: " + parst + "uah.");
        } else if ( day >= 6 & day <= 7 ) {
            System.out.println("Total price (with -20% weekend discount): " + pardis + "uah.");
        }
    }
}
