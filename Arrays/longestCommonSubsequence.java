import java.util.Arrays;

public class longestCommonSubsequence {

    public static int longestCommonSubsequence1(String str1, String str2, int i, int j, int [][] memo) {
        if(i == str1.length()) return 0;
        if(j == str2.length()) return 0;

        if(memo[i][j] != -1) {
            return memo[i][j];
        }

        int ans=0;
        if(str1.charAt(i) == str2.charAt(j)) {
            return 1+longestCommonSubsequence1(str1, str2, i+1, j+1, memo);
        }else {
        ans = Math.max(longestCommonSubsequence1(str1, str2, i + 1, j, memo), 
                       longestCommonSubsequence1(str1, str2, i, j + 1, memo));
    }
        memo[i][j] = ans;
        return ans;
   }
   

   public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int m = text1.length();
        int n = text2.length();
        int [][] memo = new int[m][n];

        for (int i = 0; i < m; i++) {
        Arrays.fill(memo[i], -1);}

       longestCommonSubsequence1(text1, text2, 0, 0, memo);
   }
}

// https://leetcode.com/problems/longest-common-subsequence/description/
