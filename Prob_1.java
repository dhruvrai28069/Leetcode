import java.util.HashMap;

public class Prob_1  {
    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        ans[0] = -1;
        ans[1] = -1;

        for (int i = 0; i < n; i++) {

            int rem = target - nums[i];
            if (map.containsKey(rem) && map.get(rem) != i) {
                ans[0] = i;
                ans[1] = map.get(rem);
                break;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
    static void main (String[]args){
        Prob_217 solver = new Prob_217();

        int[] nums = {1, 2, 3, 1};

        boolean result = solver.containsDuplicate(nums);

        if (result) {
            System.out.println("Result: Duplicate found!");
        } else {
            System.out.println("Result: No duplicates found.");
        }
    }
}