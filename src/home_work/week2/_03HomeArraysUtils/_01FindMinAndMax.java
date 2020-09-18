package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;

/*Массив создается и выводится на консоль с помощью метода в классе ArrayUtils(методы создаются вами).
    1) Найти минимальное и максимальное значения в массиве и вывести их на консоль
*/
public class _01FindMinAndMax {
    public static void main(String[] args) {

        int [] array = ArrayUtils.createAndFillArray(5);
        ArrayUtils.findMinAndMaxInArray(array);

    }
}
