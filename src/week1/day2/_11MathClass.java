package week1.day2;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class _11MathClass {
    public static void main(String[] args) {
        int a = 64;
        int sqrt = (int)Math.sqrt(a); //sqrt - корень. Обычно в типе данных "double", но мы знаем, что корень из 64 будет 8 и смело поместиться в тип данных "int";
            System.out.println("sqrt from - " + a + ", wiil be - " + sqrt);

        int pow = (int)Math.pow(5, 2); //pow - степень. Принимает два аргумента, возвращает тоже в "double";
                                        //Первое число (5) - число которое мы хотим возвести в степень;
                                        //Второе число (2) - в какую степень.
        System.out.println("pow - " + pow);

        System.out.println("Math.random (always new) - " + Math.random()); //Math.random - возвращает какое-то случайное число, каждый раз новое;

        double d = 25.7;
        int i = (int) d; //обрезали "double" - 25.7 до целого числа "int"(без отображения десятых, сотых и т.д.).
        System.out.println("double - " + d + ", convert to int - " + i);

        int random = (int)(Math.random() * 100);
        System.out.println("int random (always new) - " + random);
    }
}
