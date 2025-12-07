import java.util.Arrays;

public class Prob_26 {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int k = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
                k++;

            }
        }
        return k + 1;
    }

    static void main(String[] args) {
        Prob_26 solution = new Prob_26();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println("Original Array: " + Arrays.toString(nums));

        int k = solution.removeDuplicates(nums);

        System.out.println("Count of unique elements (k): " + k);

        System.out.print("Modified Array (valid part): [");
        for (int m = 0; m < k; m++) {
            System.out.print(nums[m]);
            if (m < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}