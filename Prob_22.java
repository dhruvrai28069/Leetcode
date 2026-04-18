import java.util.*;

public class Prob_22 {

    List<String> ans = new ArrayList<>();
    public void solve(int open, int close, String curr){
        if(open == 0 && close == 0){
            ans.add(curr);
            return;
        }
        if(open != 0){
            solve(open - 1, close, curr + "(");
        }
        if(close > open){
            solve(open, close - 1, curr + ")");
        }
    }
    public List<String> generateParenthesis(int n) {

        int close = n;
        int open = n;
        solve(open, close, "");
        return ans;
    }
}