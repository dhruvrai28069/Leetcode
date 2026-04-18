import java.util.*;

public class Prob_784 {

    List<String> ans = new ArrayList<>();
    public void solve(String s, int idx, String curr){

        if(idx == s.length()){
            ans.add(curr);
            return;
        }
        char ch = s.charAt(idx);
        if(ch >= 48 && ch<=57){
            solve(s, idx + 1, curr + ch);
        }
        else{
            solve(s, idx + 1, curr + Character.toLowerCase(ch));
            solve(s, idx + 1, curr + Character.toUpperCase(ch));
        }
    }
    public List<String> letterCasePermutation(String s) {

        solve(s, 0, "");
        return ans;
    }
}