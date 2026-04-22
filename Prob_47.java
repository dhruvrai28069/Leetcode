import java.util.*;

public class Prob_47 {

    public void solve(int[] arr, int idx, List<List<Integer>> ans) {
        if (idx == arr.length) {
            List<Integer> list = new ArrayList<>();
            for (int a : arr) {
                list.add(a);
            }
            ans.add(list);
            return;
        }
        Set<Integer> seen = new HashSet<>();

        for (int i = idx; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                continue;
            }

            seen.add(arr[i]);

            swap(arr, i, idx);
            solve(arr, idx + 1, ans);
            swap(arr, i, idx);
        }
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<List<Integer>> permuteUnique(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        solve(arr, 0, ans);
        return ans;
    }
}