package home_work.week3.part2;

import utils.MultiArrayUtils;

//    3.7. Умножить две матрицы.
public class _07IncreaseMultiArray {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,1,1}, {1,1,1}, {1,1,2}};
        int[][] matrix2 = {{1,1,1}, {1,3,1}, {1,1,1}};
        int[][] matrixRes = new int [matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrixRes[i][j] =  matrix1[i][j] * matrix2[j][i];
            }
        }
        MultiArrayUtils.printMatrix(matrixRes);


    }
}
