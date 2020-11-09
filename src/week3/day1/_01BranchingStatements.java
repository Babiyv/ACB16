package week3.day1;

public class _01BranchingStatements {
    public static void main(String[] args) {
// continue - "иди дальше", минует весь код, до самого конца цикла и запускает его заново.

        /*for (int i = 0; i < 100; i++) {
            if (i == 6 || i == 13) continue;
            System.out.println(i);
        }*/

        /*int b = 0;
        while (b < 100) {
            if (b == 6 || b ==13){
                b++; // - помнить где правильно ставить счетчик.
                continue;
            }
            System.out.println(b);
        }*/

// break - заканчивает выполнение кода.

        for (int i = 0; i < 100; i++){
            if (i == 6) break; // - в этом месте прекращает выполняться код.
            System.out.println(i);
        }

    }
}
