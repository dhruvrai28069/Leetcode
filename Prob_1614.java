public class Prob_1614 {

    public int maxDepth(String s) {

        int n = s.length();
        int maxi = 0;
        int count = 0;

        for(int i = 0; i<n; i++){

            char c = s.charAt(i);
            if(c == '('){
                count++;
                maxi = Math.max(maxi,count);
            }
            else if(c == ')'){
                count--;
            }
        }
        return maxi;
    }
}