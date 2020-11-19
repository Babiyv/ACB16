package home_work.week3.part1;

import java.util.Scanner;

/*4. Верхний регистр.
   Напишите программу, которая позволяет пользователю ввести в консоли строку, переводит первый символ слов в верхний регистр и результат выводит в консоль.
   		Вход:
   		иван васильевич

   		Выход:
   		Иван Васильевич*/
public class _04UpperRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String enter = sc.nextLine();
        System.out.println(toUpperCaseFirst(enter));
    }

    private static String toUpperCaseFirst(String incomingString) {
        String[] split = incomingString.split(" ");
        String answer = new String();
        for (int i = 0; i <split.length; i++) {
            split[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1) + " ";
            answer += split[i];
        }
        return answer.trim();
    }
}
