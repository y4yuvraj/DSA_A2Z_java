package recursion;

public class PallindromeUsingRecursion {
    public static void main(String[] args) {
        String str="aaabaaa";
        String str2="yuv";
        System.out.println(pal(str,0,str.length()-1));
        System.out.println(pal(str2,0,str2.length()-1));

    }

    static boolean pal(String str,int start,int end)
    {
        if(start>end)
            return true;
        return str.charAt(start)==str.charAt(end) && pal(str,start+1,end-1);
    }

}
