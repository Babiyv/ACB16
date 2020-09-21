package home_work.week2._03HomeArraysUtils;

import utils.ArrayUtils;

/*	3) Поменять местами наибольший и наименьший элементы в массиве*/
public class _03SwapMinAndMax {
    public static void main(String[] args) {

        int [] array = ArrayUtils.createAndFillArray(5);
        ArrayUtils.swapMinMaxInArray(array);
    }
}
