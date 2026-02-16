public class Prob_917 {

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            boolean leftIsLetter = Character.isLetter(chars[i]);
            boolean rightIsLetter = Character.isLetter(chars[j]);

            if (leftIsLetter && rightIsLetter) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            } else if (!leftIsLetter) {
                i++;
            } else {
                j--;
            }
        }
        return new String(chars);
    }
}