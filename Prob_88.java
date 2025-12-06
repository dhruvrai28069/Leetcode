import java.util.Arrays;

class Prob_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int pos = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[pos] = nums1[i];
                i--;
            } else {
                nums1[pos] = nums2[j];
                j--;
            }
            pos--;
        }

        while (j >= 0) {
            nums1[pos] = nums2[j];
            j--;
            pos--;
        }
    }

    static void main() {
        Prob_88 obj1 = new Prob_88();

        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int [] nums2 = { 2,5,6};
        int n = 3;

        System.out.println("Original nums1: " + Arrays.toString(nums1));
        System.out.println("Original nums2: " + Arrays.toString(nums2));

        obj1.merge(nums1, m, nums2, n);

        System.out.println("Merged nums1:   " + Arrays.toString(nums1));
    }
}
