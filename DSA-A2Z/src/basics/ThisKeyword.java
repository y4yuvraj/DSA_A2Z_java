package basics;

public class ThisKeyword {

    int x;

    public ThisKeyword(int x) {
        this.x=x;
    }

    ThisKeyword current()
    {
        System.out.println(this.x);
        return this;
    }

    public static void main(String[] args) {
        ThisKeyword obj1= new ThisKeyword(2);
        System.out.println(obj1.current());

        ThisKeyword obj2= new ThisKeyword(888);
        System.out.println(obj2.current());

    }
    
}
