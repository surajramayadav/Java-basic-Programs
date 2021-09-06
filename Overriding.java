class A {
    
    public  void  show() {
        System.out.println("parent");
    }
}

class B extends A {
    
    public void show() {
        System.out.println("child");
    }
}

public class Overriding {
    public static void main(String[] args) {
        A b=new B();
        b.show();
    }
}
