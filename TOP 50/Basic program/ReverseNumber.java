public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        String rev = ""; //other type
        //int rev = 0;

        while (n != 0) {
            int m = n % 10;
            rev = rev + Integer.toString(m); //other type
            //rev = rev * 10 + m;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
