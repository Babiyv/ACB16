package home_work.week1;

import java.util.Locale;
import java.util.Scanner;

/*
10. Написать программу вычисления идеального веса пользователя (рост - 100).
 Выдать рекомендации о необходимости поправиться либо похудеть.
 */
public class _10IdealBMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your weight in kg. - ");
        float kg = sc.nextFloat();
        System.out.println("Enter your height in cm. - ");
        float cm = sc.nextFloat();

        float bmi = kg / (((float)Math.pow(cm * 0.01, 2))) ;

        if (kg <= 0 | cm <= 0) {
            System.out.println("Please enter valid data - ");
        } else if (bmi < 10 | bmi >= 64 ) {
            System.out.println("Your BMI is - " + (int)bmi + ". Perhaps you was enter wrong parameters.");
        } else if (bmi < 18.5) {
            System.out.println("Your BMI is - " + (int)bmi + ". It`s mean underweight, you need eat more!");
        } else if (bmi <= 24.9) {
            System.out.println("Your BMI is - " + (int)bmi + ". It`s a normal BMI, all is Ok!");
        } else if (bmi <= 29.9) {
            System.out.println("Your BMI is - " + (int)bmi + ". A little bit overweight. Be careful, watch what you eat and do more activities.");
        }  else if (bmi <= 34.9) {
            System.out.println("Your BMI is - " + (int)bmi + ". Obese. Watch what you eat and do more activities.");
        }  else System.out.println("Your BMI is - " + (int)bmi + ". Extremely obese. Stop eat like elephant and start to do more activities!");


    }
}
