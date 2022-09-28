package Recursion;

public class FibonacciSeries
{
    public int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args)
    {
       FibonacciSeries f=new FibonacciSeries();
       int res = f.fib(9);
        System.out.println(res);
    }
}
