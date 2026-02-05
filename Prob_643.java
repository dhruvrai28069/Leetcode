public class Prob_643 {

    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        double sum = 0;
        int i = 0;
        int j = 0;
        double maxi = Double.NEGATIVE_INFINITY;

        while(j<n){
            sum += nums[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                maxi = Math.max(maxi,sum/k);
                sum -= nums[i];
                i++;
                j++;
            }
        }
        return maxi;
    }

    static void main(String[] args) {
         Prob_643 solver = new Prob_643();

         int[] nums1 = {1, 12, -5, -6, 50, 3};
         int k1 = 4;
         double result1 = solver.findMaxAverage(nums1, k1);
         System.out.println("Test Case 1 Result: " + result1);

         int[] nums2 = {-5};
         int k2 = 1;
         double result2 = solver.findMaxAverage(nums2, k2);
         System.out.println("Test Case 2 Result: " + result2);
     }
}