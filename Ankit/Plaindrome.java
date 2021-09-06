
import java.util.Scanner;
 

public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int og = num;

        int rev  = 0;

        while(num != 0 ){
            rev = rev*10 + num % 10;
            num =num/10;
        }

        System.out.println(rev);

        if(rev == og){
            System.out.println("P");
        }else{
            System.out.println("PN");

        }
    }
}
