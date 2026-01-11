// USING HASHSET:
import java.util.HashSet;

public class Prob_217b {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer>set = new HashSet<>();
        int n = nums.length;

        for(int i = 0 ; i<n ; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    static void main(String[] args) {
        Prob_217b solution = new Prob_217b();

        int[] testArray = {1, 2, 3, 1};
        System.out.println("Contains duplicate: " + solution.containsDuplicate(testArray));
    }
}