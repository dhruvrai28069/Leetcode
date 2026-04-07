import java.util.*;

public class Prob_735 {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;

        for(int i = 0; i<n; i++){
            boolean isAlive = true;
            int a = asteroids[i];

            while(!st.isEmpty() && a < 0 && st.peek()>0){

                int p = st.peek();
                if(p < -a){
                    st.pop();
                }
                else if(p > -a){
                    isAlive = false;
                    break;
                }
                else{
                    st.pop();
                    isAlive = false;
                    break;
                }
            }
            if(isAlive) st.push(a);
        }
        int m = st.size();
        int [] ans = new int[m];

        for(int i = m-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}