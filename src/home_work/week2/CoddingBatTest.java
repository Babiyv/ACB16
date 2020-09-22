package home_work.week2;

import java.util.Arrays;

public class CoddingBatTest {
    public static void main(String[] args) {

        int [] nums = {1}; // -> 14 | {3} -> 3 |{} -> 0;
        int answer = 100500;

        if (nums.length > 1){
            answer = nums[0] + nums[1];
        }
        if (nums.length == 1){
            answer = nums[0];
        }
        if (nums.length == 0){
            answer = 0;
        }
        System.out.println(answer);

    }
}
