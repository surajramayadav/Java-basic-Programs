import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How many number you want");
        count = sc.nextInt();
        System.out.print(n1 + " " + n2);// printing 0 and 1

        for (i = 2; i < count; i++)// loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;   //1  2 3
            System.out.print(" " + n3 );
        
            n1 = n2;  // 1 2 
            n2 = n3;   // 1 2
        }
    }
}
