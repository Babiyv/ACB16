package home_work.week3.part2;

import java.sql.SQLOutput;
import java.util.Scanner;

/*	3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true. */
public class _02IfEqualWriteTrue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines do you want?");
        int a = sc.nextInt();
        System.out.println("How mane columns do you want?");
        int b = sc.nextInt();


        boolean[][] matrix = new boolean[a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(i == j){
                    matrix[i][j] = true;
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
