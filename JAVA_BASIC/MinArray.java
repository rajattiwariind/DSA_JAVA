class Test
{
    static int arr[] = {10, 324, 45, 90, 9808};
    static int largest()
    {
        int i;
        int min = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }
    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }
}
