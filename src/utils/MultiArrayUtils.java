package utils;

public class MultiArrayUtils {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//                System.out.printf("%03d ", matrix[i][j]); // <- зарезервировать 3 символа под вывод инта и заполнить 0-ми отсутсвие знаков;
                System.out.printf("%-3d", matrix[i][j]); // <- зарезервировать 3 символа под вывод инта и выровнять по левому краю (чтобы по правому - убрать "-";
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix(int rows, int columns){
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }
        return matrix;
    }

}
