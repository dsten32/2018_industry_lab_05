package ictgradschool.industry.abstraction.polys;

public class SuperClass {
    public int x = 10;
    static int y = 10;
    SuperClass() {
        x = y++;
    }
    public int foo() {
        return x;
    }
    public static int goo() {
        return y;
    }

}
