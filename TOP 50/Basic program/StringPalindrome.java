import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "aabba";
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equals(rev)) {

            System.out.println("String is palindrome.");
        }
        else{
            System.out.println("String is Not palindrome.");
        }
    }
}
