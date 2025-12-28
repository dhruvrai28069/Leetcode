public class Prob_75 {

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {

        int n = nums.length;
        int low = 0;
        int curr = 0;
        int high = n - 1;
        while(curr <= high){
            if(nums[curr] == 0){
                swap(nums,curr,low);
                curr++;
                low++;
            }

            else if(nums[curr] == 1){
                curr++;
            }

            else if(nums[curr] == 2){
                swap(nums,curr,high);
                high--;
            }
        }
    }
}