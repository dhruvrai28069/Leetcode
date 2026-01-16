public class Prob_303 {

    static class NumArray {
        int[] prefix;

        public NumArray(int[] nums) {
            if (nums.length == 0) return;

            int n = nums.length;
            prefix = new int[n];

            prefix[0] = nums[0];

            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {

            if (left == 0) {
                return prefix[right];
            } else {

                return prefix[right] - prefix[left - 1];
            }
        }
    }

     static void main(String[] args) {

        int[] nums = {-2, 0, 3, -5, 2, -1};

        NumArray obj = new NumArray(nums);

        System.out.println("Sum (0, 2): " + obj.sumRange(0, 2));

        System.out.println("Sum (2, 5): " + obj.sumRange(2, 5));

        System.out.println("Sum (0, 5): " + obj.sumRange(0, 5));
    }
}