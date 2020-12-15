package home_work.week3.part2;

import utils.ArrayUtils;
import utils.MultiArrayUtils;

/*3.4. Создать массив, который будет состоять из диагонали матрици:
		1 3 5
		4 5 7  -  1 5 6
		4 5 6               */
public class _04DiagonalMatrixArray {
    public static void main(String[] args) {
//        int[][] matrix = MultiArrayUtils.createMatrix(3,3);
        int[][] matrix = {{1, 3 ,5}, {4, 5, 7}, {4, 5, 6}};

        int[] array = new int [matrix.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = matrix[i][i];
        }
        ArrayUtils.printArray(array);

    }


}
