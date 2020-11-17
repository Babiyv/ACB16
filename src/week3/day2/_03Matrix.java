package week3.day2;

import utils.ArrayUtils;
import utils.MultiArrayUtils;

import java.lang.reflect.Array;

public class _03Matrix {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createAndFillArray(5);
        int[] array2 = ArrayUtils.createAndFillArray(3);
        int[] array3 = ArrayUtils.createAndFillArray(6);

        int[][] multiArray = new int[5][3]; // <- массив(мультиАррей) с 5 массива внутри на 3 ячейки в каждом;

        int[][] multi = {{1, 2},{3, 4, 5},{6}};

        int[][] multiArray2 = new int [5][]; // <- значение во вторых скобках будет null, потому что мы отправили команду создать массив не не указали чего там должно быть;
//        заполняем массивы вместо null
        multiArray2[0] = array;
        multiArray2[1] = array2;
        multiArray2[2] = array2;
        multiArray2[3] = array3;
        multiArray2[4] = array2;

/*        for (int i = 0; i < multiArray2.length; i++) {
            for (int j = 0; j < multiArray2[i].length; j++) {
                System.out.print(multiArray2[i][j] + " ");
            }
            System.out.println();
        }*/
        MultiArrayUtils.printMatrix(multiArray2);

        System.out.println("---------");

        MultiArrayUtils.printMatrix(multi);

        System.out.println("----------");

        MultiArrayUtils.printMatrix(multiArray);
    }
}
