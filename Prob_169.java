import java.util.Arrays;

class Prob_169 {
    public int majorityElement(int[] nums) {

        int n = nums.length ;
        int count = 0;
        int candidates = 0;
        for(int i = 0 ; i < n ; i++){
            if(count == 0){
                candidates = nums[i];
            }
            if(candidates == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return candidates;
    }
     static void main(String[] args) {

        Prob_169 solution = new Prob_169();

        int[] testCase1 = {3, 2, 3};
        int[] testCase2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("--- Test Case 1 ---");
        System.out.println("Input Array: " + Arrays.toString(testCase1));
        System.out.println("Majority Element: " + solution.majorityElement(testCase1));

        System.out.println("\n--- Test Case 2 ---");
        System.out.println("Input Array: " + Arrays.toString(testCase2));
        System.out.println("Majority Element: " + solution.majorityElement(testCase2));
    }
}