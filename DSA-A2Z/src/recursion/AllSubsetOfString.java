package recursion;

public class AllSubsetOfString {
    public static void main(String[] args) {
        String str="abc";

        subset(str);

    }


    static void subset(String str)
    {
        return subset();
    }

}
