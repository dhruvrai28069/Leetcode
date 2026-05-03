public class Prob_1049 {
            
    public int lastStoneWeightII(int[] stones) {
        int n = stones.length;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += stones[i];
        }
        int s = sum;
        sum = sum / 2;

        boolean[][] t = new boolean[n + 1][sum + 1];

        for(int j = 0; j <= sum ; j++){
            t[0][j] = false;
        }
        for(int i = 0; i <= n ; i++){
            t[i][0] = true;
        }
        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < sum + 1; j++){
                if(stones[i - 1] <= j){
                    t[i][j] = t[i - 1][j - stones[i - 1]] || t[i - 1][j];
                }
                else{
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int j = 0; j < sum + 1; j++){
            if(t[n][j]){
                mini = Math.min(mini , s - (2 * j));
            }
        }
        return mini;
    }
}