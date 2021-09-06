import java.util.Scanner;

public class Arm {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);
        int sum = 0;
        int r;

        while(num >0){
            r = num % 10;
            num = num /10;
            sum = sum + r*r*r;
        }
       
        System.out.println(sum);
    }
}
