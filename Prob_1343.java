public class Prob_1343 {

    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int sum =0;
        int i = 0;
        int j = 0;
        int count = 0;
        int maxi = Integer.MIN_VALUE;
        while(j<n){
            sum += arr[j];
            if(j - i + 1 < k){
                j++;
            }
            else if(j - i + 1 == k){
                maxi = sum/k;
                if(maxi >= threshold){
                    count++;
                }
                sum -= arr[i];
                j++;
                i++;
            }
        }
        return count;
    }
    static void main(String[] args) {
        Prob_1343 solver = new Prob_1343();

        int[] arr1 = {2, 2, 2, 2, 5, 5, 5, 8};
        int k1 = 3;
        int threshold1 = 4;

        System.out.println("Test Case 1: " + solver.numOfSubarrays(arr1, k1, threshold1));

        int[] arr2 = {11, 13, 17, 23, 29, 31, 7, 5, 2, 3};
        int k2 = 3;
        int threshold2 = 5;

        System.out.println("Test Case 2: " + solver.numOfSubarrays(arr2, k2, threshold2));

    }
}

