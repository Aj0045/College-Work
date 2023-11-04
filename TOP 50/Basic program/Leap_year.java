import java.util.*;

public class Leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if (year % 400 == 0) {
            System.out.println("Year is leap year.");
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Year is leap year.");

        } else {
            System.out.println("Year is Not leap year.");
        }

    }
}
