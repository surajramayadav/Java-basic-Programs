public class Swap {
    public static void main(String[] args) {
        int a=20,b=10;
        int temp;
        System.out.println("before swap" +a+ " " +b);
        temp=b;
        b=a;
        a=temp;
        System.out.println("After swapp"+a+" " +b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapp"+a+" " +b);
    }
}
