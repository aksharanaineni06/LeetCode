class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1)
            return s;

        String LPS = "";
        for (int i = 1; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == s.length()) 
                    break;
                }
                String P = s.substring(left+1, right);
                if (P.length() > LPS.length()) {
                    LPS = P;
                }

            left = i - 1;
            right = i;

            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right == s.length()) 
                    break;
                }
                P = s.substring(left+1, right);
                if (P.length() > LPS.length()) {
                    LPS = P;
                }

        }
        return LPS;
    }
}