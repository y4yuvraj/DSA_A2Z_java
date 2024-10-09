package recursion;

public class SumofDigitsUsingRecursion {
    public static void main(String[] args) {
        int num=123;
        int num2=451;
        System.out.println(sumOfDigits(num));
        System.out.println(sumOfDigits(num2));
        System.out.println(sumOfDigits(9987));
    }

    static int  sumOfDigits(int number)
    {
        if(number<=0)
        {
            return 0;
        }
        return number%10 + sumOfDigits(number/10);
    }

}
