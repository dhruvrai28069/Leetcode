import java.util.*;

public class Prob_350 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> mpp = new HashMap<>();
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        for (int num : nums1) {
            mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int num : nums2) {
            if (mpp.containsKey(num) && mpp.get(num) > 0) {
                resultList.add(num);
                mpp.put(num, mpp.get(num) - 1);
            }
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}