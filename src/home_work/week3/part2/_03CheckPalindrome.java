package home_work.week3.part2;

/*	3.3. Написать метод, который проверяет является ли строка палиндромом */
public class _03CheckPalindrome {
    public static void main(String[] args) {
        String input = "город дорог";
        String[] word = input.split(" ");

        int counter = 0;

        for (int i = 0; i < word.length; i++){
            if (stringReverse(word[i]) == word[word.length - 1]){
              counter++;
              System.out.println(stringReverse(word[i]) + word[word.length - 1]);
          }
        }

        if (counter == word.length){
          System.out.println("Full palindrome");
        }
        else {
          System.out.println("Sorry, but not...");
        }

    }

    private static String stringReverse(String word) {
        char[] letters = word.toCharArray();
        String revers = "";
        for (int i = letters.length - 1; i >= 0; i--) {
            revers += letters[i];
            System.out.println(revers);
        }
        System.out.println(revers);
        return revers;
    }
}
