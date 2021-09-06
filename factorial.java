import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        int num;
        long sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Number :");
        num =sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum=sum*i;
        }
        System.out.println(sum);
    }
}