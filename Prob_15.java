import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prob_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

     static void main(String[] args) {
         Prob_15 solver = new Prob_15();

        int[] input1 = {-1, 0, 1, 2, -1, -4};

        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Triplets: " + solver.threeSum(input1));
        System.out.println("---");

        int[] input2 = {};
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Triplets: " + solver.threeSum(input2));
        System.out.println("---");

        int[] input3 = {0, 0, 0, 0};
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Triplets: " + solver.threeSum(input3));
    }
}
