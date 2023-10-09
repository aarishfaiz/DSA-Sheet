import java.util.Arrays;

public class longestPalindromicSubsequence {
    public static int longestCommonSubsequence(String str1, String str2, int i, int j, 
     int [][]memo) {
        if(i == str1.length()) return 0;
        if(j == str2.length()) return 0;

        if(memo[i][j] != -1) {
            return memo[i][j];
        }
        int ans=0;
        if(str1.charAt(i) == str2.charAt(j)) {
            return 1+longestCommonSubsequence(str1, str2, i+1, j+1, memo);
        }else{
            ans =  Math.max(
                    longestCommonSubsequence(str1, str2, i+1, j, memo),
                    longestCommonSubsequence(str1, str2, i, j+1, memo));
        }
        memo[i][j] = ans;
        return ans;
    }

    public static void main(String[] args) {
        String s ="bbbab";
      StringBuilder reverseS = new StringBuilder(s).reverse();

      int m = s.length();
      int n = reverseS.length();
      int [][] memo = new int[m][n];

      for(int i=0;i<m;i++) {
          Arrays.fill(memo[i], -1);
      }
      longestCommonSubsequence(s,reverseS.toString(),0,0,memo);
    }
}


// https://leetcode.com/problems/longest-palindromic-subsequence/