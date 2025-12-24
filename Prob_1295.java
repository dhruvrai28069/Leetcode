public class Prob_1295 {
    public int findNumbers(int[] nums) {

        int count = 0;
        int n = nums.length;
        int answer = 0;

        for(int i = 0 ; i<n ; i++){
            int x = nums[i];
            count=0;
            while(x != 0){
                count++;
                x = x/10;
            }
            if(count % 2 == 0){
                answer++;
            }
        }
        return answer;
    }
}