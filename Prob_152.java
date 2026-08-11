public class Prob_152 {

    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProd = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int tempMax = currentMax;

            currentMax = Math.max(num, Math.max(currentMax * num, currentMin * num));
            currentMin = Math.min(num, Math.min(tempMax * num, currentMin * num));

            maxProd = Math.max(maxProd, currentMax);
        }

        return maxProd;
    }
}
