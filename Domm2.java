package Domaha2;

import java.util.Arrays;

public class Domm2 {
    public static void main(String[] args) {
        int[] nums = {5, -7, 13, -20, 8, -9, 17, 0, -2};
        int sumIndexes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                sumIndexes = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] >= 10 && nums[j] <= 99) {
                        sumIndexes += j;
                    }
                }
                nums[i] = sumIndexes;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
