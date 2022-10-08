package Recursion;

public class PrintRecursion
{
    public static void main(String[] args)
    {
        PrintRecursion p = new PrintRecursion();
       //  p.print(15);
         p.printEvenOdd(20);
    }

    void print(int n){

        if ( n<1)
        {
            return;
        }
        print(n-1);
        System.out.println(n);
    }



        void printEvenOdd(int n){
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
