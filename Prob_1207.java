import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Prob_1207 {

    public boolean uniqueOccurrences(int[] arr) {

        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i<n ; i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> st = new HashSet<>();
        for(int a : mpp.values()){
            if(st.contains(a)){
                return false;
            }
            st.add(a);
        }
        return true;
    }
    static void main(){
        
    }
}