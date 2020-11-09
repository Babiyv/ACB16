package week3.day1;

public class _10TernaryOperator {
    public static void main(String[] args) {
        int i = 6;
        boolean b;
        int a;

       /* if (i > 10) {
            b = true;
        } else {
            b = false;
        }*/

//       <condition> ? <then> : <else>;
        b = i > 10 ? true : false; // <- if i > 10 than b = true, else(:) b = false
        System.out.println(b);

        a = i > 10 ? 100 : 0;
        System.out.println(a);

        a = true ? 100 : 0;
        System.out.println(a);




    }
}
