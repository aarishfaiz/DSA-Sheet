public class ReverseNumber {

    public static int reverse(int x) {
        String str = String.valueOf(x);

        boolean isNegative = false;
        if(str.charAt(0) == '-') {
            isNegative = true;
            str = str.substring(1);
        }
        
        str = new StringBuilder(str).reverse().toString();
         try {
            x = Integer.parseInt(str);
            return isNegative ? -x : x;
         } catch(NumberFormatException e) {
            return 0;
         }
    }
    public static void main(String[] args) {
        int x = 23;
        System.out.println(reverse(x));
    }
}
