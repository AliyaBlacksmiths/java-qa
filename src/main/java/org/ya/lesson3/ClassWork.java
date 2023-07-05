package org.ya.lesson3;

public class ClassWork {
    public static void main(String[] args) {

    }
    // может ли ладья сходить из х1 у1 в х2 у2
    // ------->        <---
    public static boolean canRook(int x1, int y1, int x2, int y2) {

        if (x1 == x2 || y1 == y2 ) {
            return true;
        }
        return false;
    }

    public static boolean canBishop(int x1, int y1, int x2, int y2) {
        if (Math.abs(x1 - x2) ==  Math.abs(y1 - y2)){
            return true;
        }
        return false;
    }


    // 12345 -> 5
    // 222 -> 3
    public static int length(int value) {
        int count = 0;
        while (value > 0){
            value /= 10;
            count ++;
        }
        return count;
    }

    public static void printN(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("* ");
        }
    }
    public  static  void printTriangle(int size){
        for (int i = 0; i < size; i++){
            System.out.println(i);
        }
    }

}
