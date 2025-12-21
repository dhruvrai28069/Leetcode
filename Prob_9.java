public class Prob_9 {
    public boolean isPalindrome(int x) {

        int reverse = 0;
        int original = x;
        if(x>0){
            while(x != 0){

                int count = x % 10 ;
                reverse = reverse * 10 + count;
                x = x/10;
            }
        }
        return reverse == original;
    }
     static void main(String[] args) {
        Prob_9 solver = new Prob_9();

        int test1 = 121;
        System.out.println(test1 + " is palindrome? " + solver.isPalindrome(test1));

        int test2 = -121;
        System.out.println(test2 + " is palindrome? " + solver.isPalindrome(test2));

        int test3 = 10;
        System.out.println(test3 + " is palindrome? " + solver.isPalindrome(test3));

        int test4 = 0;
        System.out.println(test4 + " is palindrome? " + solver.isPalindrome(test4));
    }
}