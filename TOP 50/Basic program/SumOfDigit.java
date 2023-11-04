public class SumOfDigit {
    public static void main(String[] args)
    {
        int n=12345;
        int sum = 0;

        while(n>0)
        {
            int m = n%10;
            sum+=m;
            n = n/10;

        }
        System.out.println(sum);
    }
}
