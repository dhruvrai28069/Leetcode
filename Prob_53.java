import java.util.Arrays;

public class Prob_53 {

    public int maxSubArray(int[] nums) {

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
     static void main(String[] args) {
        Prob_53 solver = new Prob_53();

        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test Case 1: " + Arrays.toString(nums1));
        System.out.println("Maximum Subarray Sum: " + solver.maxSubArray(nums1));
        System.out.println("-------------------------");

        int[] nums2 = {1};
        System.out.println("Test Case 2: " + Arrays.toString(nums2));
        System.out.println("Maximum Subarray Sum: " + solver.maxSubArray(nums2));
        System.out.println("-------------------------");

        int[] nums3 = {-5, -4, -1, -7, -8};
        System.out.println("Test Case 3: " + Arrays.toString(nums3));
        System.out.println("Maximum Subarray Sum: " + solver.maxSubArray(nums3)); // Expected: -1
    }
}