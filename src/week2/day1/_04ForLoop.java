package week2.day1;

public class _04ForLoop {
    public static void main(String[] args) {
        int[] nums = new int[15];

        for (int i = 0 ;  i < nums.length; i++){
            nums[i] = i;
        }
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }


    }
}
