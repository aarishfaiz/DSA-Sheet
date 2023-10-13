public class LongestCommonPrefix {
    public static String commonPrefix(String [] strs) {
        StringBuilder result = new StringBuilder();
        int minLen = Integer.MAX_VALUE;
 
        for(String str : strs) {
            minLen = Math.min(str.length(), minLen);
        }
         for(int i=0;i<minLen;i++){
             char currCh = strs[0].charAt(i);
 
             for(int j=1; j<strs.length;j++) {
                 if(strs[j].charAt(i) != currCh) {
                     return result.toString();
                 }
             }
             result.append(currCh);
         }
         return result.toString();
    }

    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        System.out.println(commonPrefix(strs));
    }
}
