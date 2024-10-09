package recursion;
//We are given a rope of length n,
//our task is to cut this rope into max number of pieces such that
//every rope has length of either a or b or c
public class CutTheRope {

    public static void main(String[] args) {
        System.out.println(cut(23,12,9,11));

    }

    static int cut(int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int x=Math.max(cut(n-a,a,b,c),
                Math.max(cut(n-b,a,b,c),cut(n-c,a,b,c)));
        if(x<0)
        {
            return -1;
        }
        return x+1;
    }

}
