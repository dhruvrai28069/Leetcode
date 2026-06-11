import java.util.*;

public class Prob_229 {

    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer,Integer> mpp = new HashMap<>();

        for(int i = 0; i < n; i++){
            mpp.put(nums[i],mpp.getOrDefault(nums[i],0) + 1);
        }

        for(int key : mpp.keySet()){
            if(mpp.get(key) > n/3){
                list.add(key);
            }
        }
        return list;

    }
}