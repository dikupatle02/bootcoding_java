package Recursion;

public class FactRecursion
{
    public static void main(String[] args) {
        FactRecursion f1=new FactRecursion();
        int res = f1.factorial(5);
        System.out.println(res);
    }
    public int factorial(int num){
        if(num==1)
        {
            return 1;
        }
        return num * factorial (num-1);
    }
}
