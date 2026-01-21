import java.util.Arrays;

public class Prob_35 {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

     static void main(String[] args) {
        Prob_35 solver = new Prob_35();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        System.out.println("Array: " + Arrays.toString(nums1) + ", Target: " + target1);
        System.out.println("Result Index: " + solver.searchInsert(nums1, target1));
        System.out.println("---");

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        System.out.println("Array: " + Arrays.toString(nums2) + ", Target: " + target2);
        System.out.println("Result Index: " + solver.searchInsert(nums2, target2));
        System.out.println("---");

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        System.out.println("Array: " + Arrays.toString(nums3) + ", Target: " + target3);
        System.out.println("Result Index: " + solver.searchInsert(nums3, target3));
        System.out.println("---");

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        System.out.println("Array: " + Arrays.toString(nums4) + ", Target: " + target4);
        System.out.println("Result Index: " + solver.searchInsert(nums4, target4));

    }
}