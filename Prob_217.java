// USING HASHMAP:

import java.util.HashMap;
public class Prob_217{
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer , Integer>map = new HashMap<>();
        int n = nums.length;

        for(int i = 0 ; i<n ; i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
     static void main(String[] args) {
        Prob_217 solution = new Prob_217();

        int[] testArray = {1, 2, 3, 1};
        System.out.println("Contains duplicate: " + solution.containsDuplicate(testArray));
    }
}