class Over {
    public void show() {
        System.out.println("1st");
    }
    public void show(int a) {
        System.out.println("2st");
    }

}
public class overloading {
 public static void main(String[] args) {
    Over a=new Over();
    a.show();
    a.show(10);
 }   
}
