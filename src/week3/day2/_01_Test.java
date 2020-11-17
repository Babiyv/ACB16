package week3.day2;

public class _01_Test {
    public static void main(String[] args) {
        powerN(3, 3);
    }

    public static int powerN(int base, int n) {
        if (n == 0) return 0;
        int a = base;
        return powerN(a, n - 1);
    }
}
