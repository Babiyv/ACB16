package week1.day2;

public class _06RelationalAndLogical {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;

        int c = 18;
        int d = 1;

        boolean res1 = a > b; // ответ будет "false"
        boolean res2 = c != d; // ответ будет "true"
        boolean result = res1 | res2; // если хотя бы один из них "true", то ответ будет "true"
        System.out.println(result);
        // эти же операции можно было бы записать как(не сохраняя в памяти "res1" и "res2") как: result = a < b | c != b;





    }
}
