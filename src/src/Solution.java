package src;

public class Solution {

    public String reverseWords(String s) {

        s.trim();
        StringBuilder res = new StringBuilder();
        int i  = s.length(),j = s.length();
        while (i >= 0 ){
            while (s.charAt(i) !=' '){
                i--;
            }
            res.append(s.substring(i +1,j+1) + " ");
            while (s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }
    return res.toString();
    }
}


