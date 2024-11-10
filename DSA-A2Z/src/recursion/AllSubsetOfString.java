package recursion;

public class AllSubsetOfString {
    public static void main(String[] args) {
        String str="abc";

        subset(str);

    }


    static String subset(String str)
    {

        return subset(str);
    }

}
