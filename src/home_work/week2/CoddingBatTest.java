package home_work.week2;

import java.util.Arrays;

public class CoddingBatTest {
    public static void main(String[] args) {

        int [] nums = {1, 2, 3, 4, 5, 6}; // -> {2, 3, 1}
        int [] rev = new int[nums.length];

        /*rev[0] = nums[1];
        rev[1] = nums[2];
        rev[2] = nums[0];*/

        rev[rev.length-1] = nums[0];
        int i = nums.length-1;
        while (i != 0){
            rev[i-1] = nums[i];
            i--;
        }
        int a = 0;
        while (a < nums.length){
            nums[a] = rev[a];
            a++;
        }

        System.out.println(Arrays.toString(nums));
        System.out.println("fin");
    }
}
