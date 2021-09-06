 
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = 149;
        // int num = sc.nextInt();
        
        System.out.println(num);
        int rev = 0;

        while(num != 0){
            rev = rev*10 + num % 10;
            num = num / 10;
        }
        System.out.print(rev);

    }
}
