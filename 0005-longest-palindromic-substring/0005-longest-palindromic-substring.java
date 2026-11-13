
class Solution {
    public String longestPalindrome(String s) {

        int start = 0;
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            int length = right - left - 1;

            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {

                left--;
                right++;
            }

            length = right - left - 1;

            if (length > maxLength) {
                maxLength = length;
                start = left + 1;
            }
        }

        return s.substring(start, start + maxLength);
    }
}
