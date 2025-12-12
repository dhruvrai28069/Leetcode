import java.util.Arrays;

class Prob_977 {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        int i = 0;
        int j = n-1;
        int position = n-1;

        while(i <= j){
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];

            if(right >= left){
                ans[position] = right;
                j--;
            }
            else{
                ans[position] = left;
                i++;
            }
            position--;

        }
        return ans;
    }

     static void main(String[] args) {
        Prob_977 solution = new Prob_977();

        int[] nums = {-4, -1, 0, 3, 10};

        System.out.println("Original Array: " + Arrays.toString(nums));

        int[] result = solution.sortedSquares(nums);

        System.out.println("Sorted Squares: " + Arrays.toString(result));

        System.out.println("---");

        int[] nums2 = {-7, -3, -2, -1};
        System.out.println("Original Array 2: " + Arrays.toString(nums2));
        System.out.println("Sorted Squares 2: " + Arrays.toString(solution.sortedSquares(nums2)));
    }
}