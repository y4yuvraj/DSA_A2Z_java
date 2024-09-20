package recursion;

public class PrintNto1Recursion {
    public static void main(String[] args) {
        fun(10);
    }

    private static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }

}
