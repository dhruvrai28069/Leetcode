public class Prob_136 {

    public int singleNumber(int[] nums) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum = sum ^ nums[i];
        }

        return sum;
    }

     static void main(String[] args) {
         Prob_136 solver = new Prob_136();

        int[] nums1 = {2, 2, 1};
        System.out.println("Test Case 1 Output: " + solver.singleNumber(nums1));

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Test Case 2 Output: " + solver.singleNumber(nums2));

        int[] nums3 = {1};
        System.out.println("Test Case 3 Output: " + solver.singleNumber(nums3));

    }
}
