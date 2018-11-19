package ictgradschool.industry.abstraction.polys;

public class Test1 extends SuperClass {
    int x2= 20;
    static int y2 = 20;
    Test1() {
        x2 = y2++;
    }
    public int foo2() {
        return x2;
    }
    public static int goo2() {
        return y2;
    }
    public static void main(String[] args) {
        SuperClass s1 = new SuperClass();
        Test1 t1 = new Test1();
        System.out.println("The Base object");
        System.out.println("S1.x = " + s1.x);
        System.out.println("S1.y = " + s1.y);
        System.out.println("S1.foo() = " + s1.foo());
        System.out.println("S1.goo() = " + s1.goo());
        System.out.println("\nThe Derived object");
        System.out.println("\nInherited fields");
        System.out.println("T1.x = " + t1.x);
        System.out.println("T1.y = " + t1.y);
        System.out.println("T1.foo() = " + t1.foo());
        System.out.println("T1.goo() = " + t1.goo());
        System.out.println("\nThe instance/class fields");
        System.out.println("T1.x2 = " + t1.x2);
        System.out.println("T1.y2 = " + t1.y2);
        System.out.println("T1.foo2() = " + t1.foo2());
        System.out.println("T1.goo2() = " + t1.goo2());
    }
}

