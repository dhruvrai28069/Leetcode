public class Prob_414 {

    public int thirdMax(int[] nums) {

        int n = nums.length;

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){

            if(nums[i] == first || nums[i] == second || nums[i] == third){
                continue;
            }

            if(first < nums[i]){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(second < nums[i]){
                third = second;
                second = nums[i];
            }
            else if(third < nums[i]){
                third = nums[i];
            }
        }

        if(third == Long.MIN_VALUE){
            return (int)first;
        }
        else {
            return (int)third;
        }
    }

     static void main(String[] args) {
        Prob_414 solver = new Prob_414();

        int[] nums1 = {3, 2, 1};
        System.out.println("Test Case 1 (Standard): " + solver.thirdMax(nums1));

        int[] nums2 = {1, 2};
        System.out.println("Test Case 2 (Two items): " + solver.thirdMax(nums2));

        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Test Case 3 (Duplicates): " + solver.thirdMax(nums3));

        int[] nums4 = {1, 2, Integer.MIN_VALUE};
        System.out.println("Test Case 4 (Int Min): " + solver.thirdMax(nums4));

    }
}