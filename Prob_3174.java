import java.util.*;

public class Prob_3174 {

    public String clearDigits(String s) {

        int n = s.length();

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if((ch >= 48 && ch <= 57) && !st.empty()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}