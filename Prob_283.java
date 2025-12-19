import java.util.Arrays;

public class Prob_283 {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;

        for (int j = 0; j < n; j++) {

            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;

            }
        }
    }
     static void main(String[] args) {

        Prob_283 solution = new Prob_283();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(nums));

        solution.moveZeroes(nums);

        System.out.println("Modified Array: " + Arrays.toString(nums));

        System.out.println("---");

        int[] nums2 = {1, 2, 3, 4};
        System.out.println("Original Array 2: " + Arrays.toString(nums2));
        solution.moveZeroes(nums2);
        System.out.println("Modified Array 2: " + Arrays.toString(nums2));
    }
}