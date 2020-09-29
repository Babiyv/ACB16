package home_work.week2;

import java.util.Scanner;

/*Програма генерирует случайное, целое число в диапазоне от 25 до 125 (включительно).
Пользователь пытается его угадать.
Число попыток ограничено 5.
Если пользователь ввел неверное число, программа дает подсказу (больше/меньше).
Придумать разные варианты ответов, при отгадывании с первой попытки, нескольких попыток, в случае проигрыша.*/
public class _07GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int desired = 0;
        while (desired < 25 || desired > 125){
            double a = Math.random() * 1000;
            desired = (int) a;
        }
//        System.out.println(desired);

        for  (int chance = 1; chance <= 5; chance++){
            System.out.print("Try " + chance + " of 5. Your bet: ");
            int guess = sc.nextInt();

            if (guess == desired && chance == 1){
                System.out.println("Wow!!! Grandma Wanga, is it you?!");
                chance = 6;
            } else if (guess == desired && chance == 2){
                System.out.println("Hmm... You guess! Your grandma is Wanga?!");
                chance = 6;
            } else if (guess == desired && chance == 3){
                System.out.println("You guess! Not bad;)");
                chance = 6;
            } else if (guess == desired && chance == 4){
                System.out.println("Huh, you are right! Not a big deal, yeah?! Only one chance left;)");
                chance = 6;
            } else if (guess == desired && chance == 5){
                System.out.println("Yes, it`s right! You are lucky;)");
            } else if (guess != desired && chance == 5){
                System.out.println("Sorry, you loose :(");
            } else if (guess > desired){
                System.out.println("Smaller...");
            } else if (desired > guess){
                System.out.println("Bigger...");
            }
        }




    }
}
