public class Prob_1021 {

    public String removeOuterParentheses(String s) {

        int n = s.length();
        StringBuilder st = new StringBuilder();
        int count = 0;
        int start = 0;
        int end = 0;
        for(int i = 0; i < n; i++){

            char c = s.charAt(i);
            if(c == '('){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                st.append(s.substring(start+1,end));
                start = end+1;
            }
            end++;
        }
        return st.toString();
    }
}