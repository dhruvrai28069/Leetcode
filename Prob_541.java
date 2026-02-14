public class Prob_541 {

    public void reverse(char[] nums, int i, int j){
        while(i<j){
            char temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    public String reverseStr(String s, int k) {

        char[] nums = s.toCharArray();
        int n = nums.length;

        for(int i = 0; i<n; i += 2*k){
            int j = Math.min(i + k - 1, n -1);
            reverse(nums, i, j);
        }
        return new String(nums);
    }
    static void main(){

    }
}
