package home_work.week3.part1;

import java.util.Scanner;

/*2. Ввести предложение с консоли, найти самое короткое и самое длинное слово.
    Вывести найденные слова и их длину.*/
public class _02FindShortestAndLongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите предложение:");
        String sentence = sc.nextLine();
        String[] split = sentence.split(" ");

        int shortest = 0;
        int longest = 0;

        for (int i = 0; i < split.length; i++) {
            longest = split[longest].length() < split[i].length() ? i : longest;
            /*if (split[longest].length() < split[i].length()){
                longest = i;
            }*/

            shortest = split[shortest].length() > split[i].length() ? i : shortest;
            /*if (split[shortest].length() > split[i].length()){
                shortest = i;
            }*/
        }

        System.out.println("Shortest word is: \"" + split[shortest].toLowerCase() + "\"; Size: " + split[shortest].length() + ".");
        System.out.println("Longest word is: \"" + split[longest].toLowerCase() + "\"; Size: " + split[longest].length() + ".");

    }
}
