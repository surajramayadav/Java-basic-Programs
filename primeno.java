public class primeno {
    public static void main(String[] args) {
        int count = 0;
        int num = 5;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;

                }
            }
            if (count == 2) {
                System.out.println("no is prime");
            } else {
                System.out.println("no is not prime");
            }
        } else

        {
            System.out.println("no is not prime");
        }
    }
}
