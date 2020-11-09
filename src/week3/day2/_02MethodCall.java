package week3.day2;

public class _02MethodCall {
    public static void main(String[] args) {
        a();
//        () - обозначает, что это метод;
    }

    public static void a(){
        b();
        System.out.println("Inside A");
    }

    public static void b(){
        c();
        System.out.println("Inside B");
    }

    public static void c(){
        System.out.printf("Inside C %n");
    }
}
