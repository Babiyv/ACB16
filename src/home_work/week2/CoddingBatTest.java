package home_work.week2;

import java.util.Arrays;

/*Given an array of ints,
return true if the number of 1's is greater than the number of 4's
    more14([1, 4, 1]) → true
    more14([1, 4, 1, 4]) → false
    more14([1, 1]) → true*/
public class CoddingBatTest {
    public static void main(String[] args) {
        int[] nums = {1, 4, 4};
        boolean answer = false;
        if (nums.length <= 3 & nums[0] == nums[nums.length - 1]){
            answer = true;
        } else if (nums.length > 3 && nums[0] >= nums[3]){
            answer = true;
        }

        System.out.println(answer);

    }
}
