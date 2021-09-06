import java.util.Scanner;

class Array {
    public static void main(String[] args) {
       
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        // reading the number of elements from the that we want to enter
        n = sc.nextInt();
        System.out.println(n);
        int arr[] = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i <n; i++) {
            // reading array elements from the user
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}