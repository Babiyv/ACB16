package week2.day1;

public class _01Arrays {
    public static void main(String[] args) {
// как создать массив: <data type[] <variable_name> = {<data1>, <data2>, <data3>};

    int[] numbers = {1, 15, 12, 0};

// как создать пустой массив (и потом туда все помещать):
// <data type> [] <variable_name> = new <data_type>[size];

    int [] numbers2 = new int [4];

// int, byte, short, long -> 0
// double, float -> 0.0
// char -> \u0000
// boolean -> false
// * "->" - значение по умолчанию будет...

/* если попросить вывести больше ячеек чем мы изначально заложили, то выдаст ошибку:
ArrayIndexOutOfBoundsException;
пример: numbers2[4] = 19;
*/

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
/*      ArrayIndexOutOfBoundsException
        System.out.println(numbers[4]);
 */


    }
}
