package home_work.week3.part2;

import utils.ArrayUtils;
import utils.MultiArrayUtils;

import java.util.Scanner;

/*	3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8 */
public class _01CreateMatrixAndFillFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many lines you need?");
        int a = sc.nextInt();
        System.out.println("How many columns you need?");
        int b = sc.nextInt();
        int[][] matrix = createMatrixAndFeelRandomly(a, b);

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (matrix[i][j] % 5 == 0){
                    matrix[i][j] = 8;
                }
            }
        }
        MultiArrayUtils.printMatrix(matrix);
    }

    private static int[][] createMatrixAndFeelRandomly(int a, int b) {
        int[][] matrix = new int[a][b];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[a].length; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
        return matrix;
    }

}
