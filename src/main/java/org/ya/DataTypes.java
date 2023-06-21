package org.ya;

public class DataTypes {
    // целые числа
    // byte 1b, short 2b, int 4b, long 8b

    // вещественные числа
    // float 4b,  double 8b

    public static void main(String[] args) {
        byte b = (byte) 1000; // -128 127 1b
        System.out.println(b);
        // операции с целыми числами
        // + - * / - деление нацело % - остаток от деления

        int x = 135;
        System.out.println(x % 10);//получить 5
        System.out.println(x / 100);//получить 1
        System.out.println((x / 10) % 10);//получить 3

        // ++ --
        // ++x;
        System.out.println(x++);
        System.out.println(x); // 136

        x = x++ + ++x; // 136 + 137 + 1
        // ++x
        System.out.println(x);
        // += -= *=

        int y = 1;
        y += 3; // y = y + 3
        System.out.println(y);
        int e = 22;
        long c = 12;
        c = e;

        int z = (int) c;

        float d1 = 1 / 3f;
        double d2 = 2 / 6.;
        System.out.println(Math.abs(d1 - d2) < 1e-8);
        System.out.printf("%.20f\n%.20f", d1, d2);
        // литералы
        // 12, 12l (long) 12L (long),
        // 0x12 (hex), 012 (oct), 0b1100 (bin)
        // 1e2 = 100, 23e-1 = 2.3 1e-6 = 0.000001
    }
}
