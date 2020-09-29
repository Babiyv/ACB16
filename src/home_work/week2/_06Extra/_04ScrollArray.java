package home_work.week2._06Extra;

import java.util.Arrays;

/*6.4 Сдвинуть массив на заданное количество позиций/
{1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}.
Количество позиций и массив указывает пользователь.*/
public class _04ScrollArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5}; // -> {4, 5, 1, 2, 3}
        int step = -2;
        int a;

        if (step > 0) {
            for (int n = 0; n < step; n++) {
                a = array[array.length - 1];
                for (int i = array.length - 1; i > 0; array[i] = array[i - 1], i--);
                array[0] = a;
            }
        }
        if (step < 0) { // <- просто захотел дополнительно попрактиковаться и сделал "прокрутку" в обратном направлении, при вводе отрицательного количества;
            for (int n = 0; n > step; n--) {
                a = array[0];
                for (int i = 0; i < array.length - 1; array[i] = array[i + 1], i++);
                array[array.length - 1] = a;
            }
        }
        System.out.println(Arrays.toString(array));

    }
}
