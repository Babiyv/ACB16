package home_work.week3.part1;

import utils.ArrayUtils;

/*5. Ввести предложение с консоли, каждое четное слово инвертировать, в каждом нечетном слове удалить каждую четную букву.
    Результат выводить на консоль.
    Ввод:
    Как решить это задание и не сломать себе голову?
    Вывод:
    каК ршт отэ здне и н ьтамолс сб ?уволог                 <- ошибка в примере условии задачи*
*/
public class _05InvertWordDeleteLetter {
    public static void main(String[] args) {

        String incomingString = "Как решить это задание и не сломать себе голову?";
        String[] word = incomingString.split(" ");
        int a = 0;

        for (int i = 0; i < word.length; i++) {
            if (i % 2 != 0) {
                printReverse(word[i]);
            }
            else {
                printWithoutEverEvenChar(word[i]);
            }
        }
    }

    private static void printWithoutEverEvenChar(String word) {
        char[] symbols = word.toCharArray();
        for (int j = 0; j < symbols.length; j++) {
            if (j % 2 == 0){
                System.out.print(symbols[j]);
            }
        }
        System.out.print(" ");
    }

    public static void printReverse(String word){
        char[] symbols = word.toCharArray();
        for (int j = symbols.length - 1; j >= 0; j--) {
            System.out.print(symbols[j]);
        }
        System.out.print(" ");
    }
}
