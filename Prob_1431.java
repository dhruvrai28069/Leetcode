import java.util.ArrayList;
import java.util.List;

class Prob_1431{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;
        List<Boolean> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            if(candies[i] > maxi){
                maxi = candies[i];
            }
        }

        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extraCandies >= maxi){
                list.add(true);
            }
            else list.add(false);
        }
        return list;
    }

     static void main(String[] args) {
        Prob_1431 solver = new Prob_1431();


        int[] candies1 = {2, 3, 5, 1, 3};
        int extra1 = 3;
        System.out.println("Test Case 1: " + solver.kidsWithCandies(candies1, extra1));

        int[] candies2 = {4, 2, 1, 1, 2};
        int extra2 = 1;
        System.out.println("Test Case 2: " + solver.kidsWithCandies(candies2, extra2));

        int[] candies3 = {12, 1, 12};
        int extra3 = 10;
        System.out.println("Test Case 3: " + solver.kidsWithCandies(candies3, extra3));

    }
}
