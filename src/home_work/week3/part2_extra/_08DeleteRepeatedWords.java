package home_work.week3.part2_extra;

import utils.ArrayUtils;

//	3.8*. Удалить из предложения слова которые повторяются.
public class _08DeleteRepeatedWords {
    public static void main(String[] args) {
        String input = "One double two double three double";
        String[]  words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            String wanted = words[i];
            int counter = 0;
            for (int j = i + 1; j < words.length; j++) {
                if (wanted.equalsIgnoreCase(words[j])){
                    counter += 1;
                    words[j] = "";
                }
            }
            if (counter > 0){
                words[i] = "";
            }
        }
        ArrayUtils.printArray(words);

    }
}
