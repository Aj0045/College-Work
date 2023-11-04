public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(10);
    }

    static void fibonacci(int n) {
        int a = 0, b = 1;
        int c=0;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }


    }
}