package home_work.week2._06Extra;

import java.util.Arrays;

/*6.1 Инвертировать массив (без использования дополнительного массива)*/
public class _01ArrayBackward {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        int a, b;
        for(int i = 0; i < array.length / 2; i++){
            a = array[i];
            b = array[array.length - 1 - i];
            array[i] = b;
            array[array.length - 1 - i] = a;
        }
        System.out.println(Arrays.toString(array));
    }
}
