public class Prob_485 {

    public int findMaxConsecutiveOnes(int[] nums) {

        int maxcount = 0;
        int currentcount = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                currentcount++;
                // Update maxcount if current run of 1s is larger
                if(currentcount > maxcount) {
                    maxcount = currentcount;
                }
            } else {
                // Reset counter when a 0 is encountered
                currentcount = 0;
            }
        }

        return maxcount;
    }

     static void main(String[] args) {
         Prob_485 solver = new Prob_485();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Test Case 1: " + solver.findMaxConsecutiveOnes(nums1));

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Test Case 2: " + solver.findMaxConsecutiveOnes(nums2));

        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Test Case 3: " + solver.findMaxConsecutiveOnes(nums3));

        int[] nums4 = {0, 0, 0};
        System.out.println("Test Case 4: " + solver.findMaxConsecutiveOnes(nums4));

    }
}