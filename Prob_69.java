public class Prob_69 {

    public int mySqrt(int x) {

        if (x < 2) return x;

        int low = 1;
        int high = x / 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            else if (square > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return high;
    }
}