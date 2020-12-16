package home_work.week3.part2;

import utils.ArrayUtils;

public class Test {
    public static void main(String[] args) {
        String input = "город";
        String[] words = input.split(" ");
        String[] wordsRevers = new String[words.length];

        for (int i = 0; i <words.length; i++) {
            String[] letter = words[i].split("");
            ArrayUtils.printArray(letter);
            for (int j = letter.length - 1; j >= 0; j--){
                wordsRevers[i] += letter[j];
                ArrayUtils.printArray(wordsRevers);
            }
        }


    }
}
