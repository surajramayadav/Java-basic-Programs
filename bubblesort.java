public class bubblesort {
    public static void main(String[] args) {

        int a[] = { 4, 12, 7, 8, 9 };
        int n = a.length;
        System.out.println(n);
        for (int i = 0; i <n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    
                }
            }
        }
        for(int z=0;z<=a.length-1;z++){
            System.out.print(a[z]);
        }
    }
}
