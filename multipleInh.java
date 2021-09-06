interface a {
    public void m1();
}
interface b{
    public void m2();
}
class Ext implements a,b{
    public void m1(){
        System.out.println("class a");
    }
    public void m2(){
        System.out.println("class b");
    }
}
public class multipleInh {
    public static void main(String[] args) {
        Ext c=new Ext();
        c.m1();
        c.m2(); 
    }
}
