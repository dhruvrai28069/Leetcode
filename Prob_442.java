import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Prob_442 {

    public List<Integer> findDuplicates(int[] nums) {

        int n = nums.length;

        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i<n ; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0) +1);
        }
        for(int a : mpp.keySet()){
            if(mpp.get(a) == 2){
                list.add(a);
            }
        }
        return list;
    }
    static void main(){

    }
}