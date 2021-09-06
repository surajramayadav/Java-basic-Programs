
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
class child1 extends child {
    public void m3() {
        System.out.println("child1");
    }

}

public class multilevelInh {
  public static void main(String[] args) {
    child1 c=new child1();
    c.m1();
    c.m2();
    c.m3();
  }  
}
