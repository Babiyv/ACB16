package week1.day2;

public class _04RelationalOperations {
    public static void main (String [] args) {
        int a = 5;
        int b = 14;

// действие и результат сохранится в памяти и потом можно будет на него "сослаться"
        boolean result = a > b;
        System.out.println(result);

//результат не сохранится и нельзя будет в дальнейшем сослаться на эту запись.
// Фактически это просто вывод на экран
        System.out.println(a > b);


        result = a == b; //переводится как "а" равно "b"
        result = a != b; //переводится как "а" НЕ равно "b"
        result = a <= b; //переводится как "а" меньше или равно "b"
        result = a >= b; //переводится как "а" больше или равно "b"
        result = a < b; //переводится как "а" меньше "b"
        result = a > b; //переводится как "а" больше "b"

        System.out.println(result);






    }
}
