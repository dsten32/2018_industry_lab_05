package ictgradschool.industry.abstraction.polys;

public class Test1 extends SuperClass {
    static int x = 15;
    static int y = 15;
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
        SuperClass s2 = new Test1();



        System.out.println("\nThe static Binding");
        System.out.println("S2.x = " + s2.x);
        System.out.println("S2.y = " + s2.y);
        System.out.println("S2.foo() = " + s2.foo());
        System.out.println("S2.goo() = " + s2.goo());
    }

}


