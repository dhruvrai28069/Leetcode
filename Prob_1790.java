public class Prob_1790 {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        java.util.List<Integer> diffIndices = new java.util.ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffIndices.add(i);
            }
            if (diffIndices.size() > 2) {
                return false;
            }
        }
        if (diffIndices.size() != 2) {
            return false;
        }
        int i = diffIndices.get(0);
        int j = diffIndices.get(1);

        return s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i);
    }
    static void main(){

    }
}