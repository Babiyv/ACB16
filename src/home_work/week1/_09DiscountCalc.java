package home_work.week1;

import java.util.Scanner;

/*
9. Вычислить стоимость покупки с учетом скидки.
Скидка в 10% предоставляется, если сумма покупки превышает 1000 гривен.
 */
public class _09DiscountCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price of your purchase - ");
        double price = sc.nextDouble();

        if (price <= 0) {
            System.out.println("Please enter correct price...");
        }
        else if (price < 1000) {
            System.out.println("No discount. Total payment is - " + price + "uah.");
        }
        else System.out.println("Discount is 10% off. Total payment is - " + (price - (price * 0.1) + "uah."));



    }
}
