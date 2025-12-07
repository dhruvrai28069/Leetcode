import java.util.Arrays;

class Prob_27 {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int i = 0;

        for(int j = 0 ; j < n ; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    static void main() {
        Prob_27 solver = new Prob_27();
        int [] nums = {1,3,5,6,7,7,6,5,};
        int val = 6;

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Value to remove: " + val);
        System.out.println("-----------------------------");

        int k = solver.removeElement(nums, val);

        System.out.println("New Length (k): " + k);

        System.out.print("Modified Array: [");
        for (int m = 0; m < k; m++) {
            System.out.print(nums[m]);
            if (m < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}