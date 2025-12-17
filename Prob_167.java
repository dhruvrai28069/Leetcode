import java.util.Arrays;
public class Prob_167 {

    public int[] twoSum(int[] numbers, int target) {

        int[] ans = new int[2];
        int n = numbers.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                ans[0] = i + 1;
                ans[1] = j + 1;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }

     static void main(String[] args) {
        Prob_167 solver = new Prob_167();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(numbers, target);

        System.out.println("Input Array: " + Arrays.toString(numbers));
        System.out.println("Target: " + target);
        System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
    }
}