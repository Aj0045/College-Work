public class MaximumOfArray {
    public static void main(String[] args)
    {
        int arr[] = {10,12,30,54,67,34,4};
        int max = arr[0];

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
