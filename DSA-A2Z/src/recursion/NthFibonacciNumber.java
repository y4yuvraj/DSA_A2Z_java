package recursion;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        //3 -> 0,1,2 op:2
        //4 op:3

        System.out.println(fib(6)); //0,1,2,3,5 op:5
    }

    private static int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return fib(n-1)+fib(n-2);

    }
}
