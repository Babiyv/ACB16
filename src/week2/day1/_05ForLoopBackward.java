package week2.day1;

public class _05ForLoopBackward {
    public static void main(String[] args) {
//        int[] nums = new int[15];

        /*int num = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            nums[i] = num;
            num--;
            System.out.print(nums[i] + " ");
        }*/

//          облегченный вариант верхнего кода:
/*
        for (int i = 0, num = nums.length - 1; i < nums.length; i++, num--) {
            nums[i] = num;
            System.out.print(nums[i] + " ");
        }
*/

//          мой вариант кода:
        int[] rev = new int[15];
        for (int a = rev.length - 1; a >= 0; a--) {
            rev[a] = a;
            System.out.print(rev[a] + " ");
        }

    }
}
