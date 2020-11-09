package week3.day1;

public class _03Formatter {
    public static void main(String[] args) {
        int age = 25;
        String name = "John";
        String surname = "Snow";
        double salary = 5000 / 3;

/*
        System.out.println("My name is " + name + ", my surname - " + surname +
                ", age - " + age + ", salary - " + salary);
*/
        System.out.printf("\tMy name is %s, my surname - %s, age - %d, salary - %.1f\n", name, surname, age, salary);
//       Format specifiers:
//        %s - string;
//        %c - char;
//        %d - int или любый другие целочисленные типы данных;
//        %f - float or double;
//        \n или %n - escape-последовательность (перенос на следующую строку; начало следуюзего вывода с новой строки). Нужно ставить принудительно.
//        \t - табуляция при выводе строки.

        System.out.printf("%-15s %15s%10d%6.1f\n", name, surname, age, salary);
//       Width & precision:
//        15 / 10 - ширина переменной, сразу резервирует определенное количество знаков под вывод; Без нее вывод может быть очень длинным. Применяется, например, в таблицах.

//       Flags:
//        .1 - до какого количества знаков после запятой хотим сократить вывод float/double;
//        "-" - сместить влево;
//        "0" - spaces fill with 0;
//        "+" - spaces fill with +;

        System.out.printf("My name is %1$s, my surname - %3$s, age - %4$d, salary - %2$.1f\n", name, salary, surname, age);
//        "$" - номер(последовательность) переменной при выводе;

//        Последовательность при написании: %[arg_idx$][flags][width][.precision]conversion

    }
}
