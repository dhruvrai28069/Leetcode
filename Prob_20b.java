import java.util.Stack;

public class Prob_20b {

    public boolean isValid(String s) {

        int n = s.length();
        Stack<Character> st = new Stack<>();


        for(int i = 0; i<n; i++){

            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) return false;
                if(c == ')' && st.peek() == '(' || c == '}' && st.peek() == '{' || c == ']' && st.peek() == '['){
                    st.pop();
                }
                else return false;
            }
        }
        if(st.empty()) return true;
        else return false;

    }
}