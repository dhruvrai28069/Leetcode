import java.util.HashMap;

public class Prob_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i = 0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                if(Math.abs(i -map.get(nums[i]))<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
    static void main(String[] args) {
        Prob_219 solution = new Prob_219();


            int[] nums1 = {1, 2, 3, 1};
            int k1 = 3;
            System.out.println("Test Case 1: " + solution.containsNearbyDuplicate(nums1, k1));

            int[] nums2 = {1, 0, 1, 1};
            int k2 = 1;
            System.out.println("Test Case 2: " + solution.containsNearbyDuplicate(nums2, k2));

            int[] nums3 = {1, 2, 3, 1, 2, 3};
            int k3 = 2;
            System.out.println("Test Case 3: " + solution.containsNearbyDuplicate(nums3, k3));
        }
}