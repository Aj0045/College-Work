import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count;
        int i;

        for (i = 2; i <= num; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {

                System.out.print(i + ",");

            }

        }

    }

}
