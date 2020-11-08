package week3;

public class _09Condition2 {
    public static void main(String[] args) {
        int a = 13;
        int counter = 0;
        int counter2 = 0;

//        | - проходится/проверяет все параметры условия, независимо от того повстречаются ли false результаты.
//        за счет этого будет доходить до ++counter и перезаписывать его на +1.
//        будет достаточно чтобы хоть один из парметров был true (подпадал под условие).
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
