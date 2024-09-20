package recursion;

public class Print1ToNRecursion {
    public static void main(String[] args) {
        fun(10);
        System.out.println();
        fun2(10,1);
    }

    //non tail recursive
    private static void fun(int n)
    {
        if(n==0)
        {
            return;
        }
        fun(n-1);
        System.out.print(n+" ");
    }

    //tail recursive (better)
    private static void fun2(int n,int i)
    {
        if(n==0)
        {
            return;
        }
        System.out.print(i+" ");
        fun2(n-1,i+1);
    }
}

