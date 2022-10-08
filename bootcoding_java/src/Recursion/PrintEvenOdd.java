package Recursion;

public class PrintEvenOdd
{
    public static void main(String[] args)
    {
        PrintEvenOdd p = new PrintEvenOdd();
        p.printEvenOdd(20);
    }

        void printEvenOdd(int n)
    {
        if(n<1)
        {
            return;
        }

        if (n%2==0)
        {
            System.out.println(n);

        }
        printEvenOdd(n-1);
        if(n%2!=0)
        {
            System.out.println(n);
        }

    }

}
