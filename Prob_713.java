public class Prob_713 {

    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int n = nums.length;
        int product = 1;
        int count = 0;
        int i = 0;

        for(int j=0 ; j<n ; j++){

            product *= nums[j];
            while(product >= k && i <= j){
                product /= nums[i];
                i++;
            }
            count += (j - i + 1);
        }
        return count;
    }

    static void main(){

    }
}