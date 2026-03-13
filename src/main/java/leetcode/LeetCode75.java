package leetcode;

public class LeetCode75 {

    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 0;
        if (nums == null || nums.length == 0) return 0;
        int count = 1;

        while (j < nums.length) {
            if(nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
                count++;
            }
            j++;
        }

        return count;
    }

    public int removeDuplicatesTwice(int[] nums) {

        int i = 0;
        int j = 0;
        if (nums == null || nums.length == 0) return 0;
        int count = 1;

        while (j < nums.length) {
            if(nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
                count++;
            }
            j++;
        }

        return count;
    }

}
