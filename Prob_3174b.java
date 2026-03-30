public class Prob_3174b {

    public String clearDigits(String s) {

        int n = s.length();

        StringBuilder sb = new StringBuilder();


        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch <= 57){
                sb.deleteCharAt(sb.length() - 1);
            }
            else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
