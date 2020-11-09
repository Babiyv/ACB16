package week3.day2;

// рекурсия - повторное обращение метода к самому себе
// "+": красиве выглядит код и меньше строк/текста;
// "-": сложнее/дольше работает, потому что использует больше памяти;
public class _04_Recursion {
    public static void main(String[] args) {
        f(1);
        System.out.printf(" // f() over %n");
        f2(1);
        System.out.println(" // f2() over");
        f3(1);
        System.out.println(" // f3() over");
        System.out.println(factorial(5) + "  // factorial() over");
        System.out.println(factorialRecursion(5) + "  // factorialRecursion() over");
        System.out.println(factorialRecursionTernaryOperator(5) + "  // factorialRecursionTernaryOperator() over");
        System.out.println(fibonacciCycle(7) + "  // fibonacciCycle() over");
        System.out.println(fibonacciRecursion(7) + "  // fibonacciRecursion() over");
        f4(1);
        System.out.println(" // f4() over");
    }

    public static void  f(int i){
        if(i < 3){
            System.out.print(i + " ");
            f(i + 1); // <- не перезаписываем значение i, а просто передаем в "следующий" метод i+1 (и так до конца);
        }
    }

    public static void f2(int i){
        if(i < 3){
            f2(i + 1);
            System.out.print(i + " ");
        }
    }

    public static void f3(int i){
        if(i >= 10) return; // <- обязательное условие выхода;
            f3(i + 1); // <- вечный цикл, пока не закончится память стека (1мб.);
            System.out.print(i + " ");
    }

    public static int factorial(int i){
        int factorial = 1;
        for (int j = 1; j <= i; j++){
            factorial *= j;
        }
        return factorial;
    }

    public static int factorialRecursion(int i){
        if(i == 1) return 1;
        return i * factorialRecursion(i - 1);
    }

    public static int factorialRecursionTernaryOperator (int i){
        return i < 2 ? i :  i  * factorial(--i);
    }

    public static int fibonacciCycle(int i){
        int fibonacciPosition = 1;
        int f1 = 0;
        int f2 = 1;
        if(i == 0) return f1;
        int fibonacceNumber = f1 + f2;

        while (fibonacciPosition < i){
          fibonacceNumber = f1 + f2;
          f1 = f2;
          f2 = fibonacceNumber;
          fibonacciPosition++;
        }
        return  fibonacceNumber;
    }

    public static int fibonacciRecursion(int i){
        if (i == 0 || i == 1){ // <- числа фибоначчи 0 и 1 равны своему индексу (0 и 1);
            return i; // <- поэтому возвращаем само число;
        } else {
            return fibonacciRecursion(i - 1) + fibonacciRecursion(i - 2); // <- возвращаем сумму предыдущего числа и еще через одно;
        }
    }

    public static void f4(int i){
        if (i >= 10) return; // <- после того, как мы уже сюда зашли с предыдущего цикла, то вылетим(ретерн) мы обратно в него же (предыдущий цикл);

        System.out.print(i + " ");
        f4(i + 1); // <- заходим дальше в цикл;
        System.out.print(i + " ");  // <- попадаем сюда после return из прошлой цикла(на предыдущей строке);
    }

    public static void f5(int i){
        if (i >= 10) return; // <- после того, как мы уже сюда зашли с предыдущего цикла, то вылетим(ретерн) мы обратно в него же (предыдущий цикл);

        System.out.print(i + " ");
        f5(++i); // <- с перезаписаной i заходим дальше в цикл;
//        если бы было (i++), то програма ложилась бы, потому что передавало бы 1 раньше, чем увеличивала бы ее. А так, она ее вначале увеличивает, а потом передает;
        System.out.print(i + " ");  // <- попадаем сюда после return из прошлой цикла(на предыдущей строке);
    }
}
