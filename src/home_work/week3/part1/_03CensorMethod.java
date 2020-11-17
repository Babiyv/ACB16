package home_work.week3.part1;

import utils.ArrayUtils;
import java.util.Scanner;

/*3. Напишите метод, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой»(не используя метод replaceAll()).
 */
public class _03CensorMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String input = sc.nextLine();
//        String input = "Эта бяка была такая бяка";

        ArrayUtils.printArray(censorCheck(input, "бяка"));
        /*String censor = "бяка";
        String array[] = input.split( " ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(cens)){
                array[i] = "*censor*";
            }
        }*/
    }

    private static String[] censorCheck(String inputString, String censorWord) {
        String array[] = inputString.split(" ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(censorWord)){
                array[i] = "*censor*";
            }
        }
        return array;
    }
}
