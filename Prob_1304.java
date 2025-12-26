import java.util.Arrays;

public class Prob_1304 {

    public int[] sumZero(int n) {

        int[] result = new int[n];
        int i = 0;
        int j = n-1;

        while(i < j){
            result[i] = -(i + 1);
            result[j] = (i + 1);
            i++;
            j--;
        }
        return result;
    }
    static void main() {

         Prob_1304 Example = new Prob_1304();
        int n = 5;
        int[] output = Example.sumZero(n);

        System.out.println("Input: " + n);
        System.out.println("Output: " + Arrays.toString(output));
    }
}