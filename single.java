
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

public class single {
    public static void main(String[] args) {
        child b = new child();
        b.m1();
        b.m2();
    }
}
