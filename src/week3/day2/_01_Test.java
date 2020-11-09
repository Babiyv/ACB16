package week3.day2;

public class _01_Test {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int i){
        int factorial = 1;
        for (int j = 1; j <= i; j++){
            factorial *= j;
        }
        return factorial;
    }
}
