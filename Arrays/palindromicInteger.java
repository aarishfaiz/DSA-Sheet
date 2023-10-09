public class palindromicInteger {
    public static boolean palindromicNumber(int x) {
        int n = x;
        int rev = 0;
        int d;

        while(n > 0) {
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if(rev == x) return true;
        return false;
    }

    public static void main(String[] args) {
        int x = 1211;
        System.out.println(palindromicNumber(x));
        
    }
}
