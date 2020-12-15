package home_work.week3.part2;

/*3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
	   b) Поменять наибольший и наименьший столбик в двухмерном массиве.*/

import utils.ArrayUtils;
import utils.MultiArrayUtils;

public class _05ChangeLineInMultiArray {
    public static void main(String[] args) {
//        a) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке);
        int[][] multiArray1 = {{1}, {2, 2}, {3, 3, 3}};
        int[] array = new int [multiArray1.length];
        for (int i = 0; i < multiArray1.length; i++) {
            for (int j = 0; j < multiArray1[i].length; j++) {
                array[i] += multiArray1[i][j];
            }
        }
        int min = 1;
        int max = 0;
        int nMin = 0;
        int nMax = 0;
        for (int n = 0; n < array.length; n++) {
            if (min > array[n]) {
                min = array[n];
                nMin = n;
            }
            if (max < array[n]) {
                max = array[n];
                nMax = n;
            }
        }

        int[] swap = multiArray1[nMax];
        multiArray1[nMax] = multiArray1[nMin];
        multiArray1[nMin] = swap;

        System.out.println("// a) Поменять наибольшую строку массива с наименьшей в двухмерном массиве:");
        MultiArrayUtils.printMatrix(multiArray1);
        System.out.println("\n");

//        b) Поменять наибольший и наименьший столбик в двухмерном массиве:
        int[][] multiArray2 = {{1, 2, 3}, {4, 5, 6}};

        int[] column = new int [multiArray2[1].length];

        for (int i = 0; i < multiArray2[1].length; i++) {
            for (int j = 0; j < multiArray2.length; j++) {
                column[i] += multiArray2[j][i];
            }
        }

        for (int n = 0; n < column.length; n++) {
            if (min > column[n]) {
                min = column[n];
                nMin = n;
            }
            if (max < column[n]) {
                max = column[n];
                nMax = n;
            }
        }
        for (int i = 0; i < multiArray2.length; i++) {
            int swapN = multiArray2[i][nMax];
            multiArray2[i][nMax] = multiArray2[i][nMin];
            multiArray2[i][nMin] = swapN;
        }

        System.out.println("// b) Поменять наибольший и наименьший столбик в двухмерном массиве:");
        MultiArrayUtils.printMatrix(multiArray2);


    }
}
