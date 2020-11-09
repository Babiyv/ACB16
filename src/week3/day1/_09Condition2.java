package week3.day1;

public class _09Condition2 {
    public static void main(String[] args) {
        int a = 13;
        int counter = 0;
        int counter2 = 0;

//        | - проходится/проверяет все параметры условия, независимо от того повстречаются ли false результаты.
//        проверит все условия, даже если условие 1 уже верно;
//        за счет этого будет доходить до ++counter и перезаписывать его на +1.
        if(a < 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a > 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a > 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a > 15 | ++counter > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }

//        || - проходится/проверяет параметры условия, до первого результата false (как только что-то не будет подходить под условие).
//        если условие 1 истинно, то до условий 2 и 3 НЕ будет доходить (не будут проверены/выполнены);
//        за счет этого НЕ будет доходить до ++counter и перезаписывать его на +1.
        if(a > 15 || ++counter2 > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a > 15 || ++counter2 > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a > 15 || ++counter2 > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
        if(a > 15 || ++counter2 > 3){
            System.out.println("Inside");
        } else {
            System.out.println("Out");
        }
    }
}
