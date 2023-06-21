package org.ya;

public class Func {
    // function
    // dataType name(dataType p1, dataType p2 ..) {}

    static int sum(int a, int b) {
        return a + b;
    }

    static void print1() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        print1();
    }
}
