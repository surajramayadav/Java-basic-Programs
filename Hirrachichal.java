class parent {
    public void m1() {
        System.out.println("parent");
    }
}

class child extends parent {
    public void m2() {
        System.out.println("child");
    }

}
class child1 extends parent {
    public void m3() {
        System.out.println("child1");
    }

}
public class Hirrachichal {
   public static void main(String[] args) {
    child1 c=new child1();
    child c1=new child();
    c.m1();
    c.m3();
    c1.m1();
    c1.m2();
   } 
}
