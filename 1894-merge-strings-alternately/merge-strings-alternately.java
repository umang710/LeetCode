class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int len = Math.max(n, m);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            if (i < n) sb.append(word1.charAt(i));
            if (i < m) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}