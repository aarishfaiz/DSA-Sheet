public class rainTrappingProblem {
    public static int rainTrapping(int [] height) {
        int n = height.length;
        int ans = 0;
        int [] left = new int [n];
        int [] right = new int [n];
        left[0] = height[0];
        right[n-1] = height[n-1];

        //Obtaining the left max value for particular index
        for(int i=1;i<height.length;i++) {
            left[i] = Math.max(left[i-1], height[i]);
        }
        //Obtaining the right max value for particular index
         for(int j=n-2;j>=0;j--) {
            right[j] = Math.max(right[j+1], height[j]);
        }
        //Subtracting the min height for the particular index
        for(int i=0;i<n;i++) {
            ans += Math.min(right[i],left[i]) - height[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
