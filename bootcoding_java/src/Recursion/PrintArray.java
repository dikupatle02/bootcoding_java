package Recursion;

public class PrintArray
{
    public static void main(String[] args)
    {
        PrintArray p1 = new PrintArray();
        int a[] = {1, 2, 3, 4, 5};
        p1.printArray(a, 0);
    }
    private void printArray(int[] a, int i)
    {
        int n = a.length;
        if (i >= n)
        {
            return;
        }
        if(i % 2 == 0)
        {
            System.out.println(a[i]);
        }
        printArray(a,++i);

        if(i % 2 != 0){
            System.out.println(a[i]);
        }
    }
}
