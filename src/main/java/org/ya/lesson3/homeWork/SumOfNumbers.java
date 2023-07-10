package org.ya.lesson3.homeWork;

public class SumOfNumbers {
    //    @@ -0,0 +1,9 @@
//    Дано целое число типа long
//12345 = 1 + 2 + 3 + 4 + 5 => 15 = 1 + 5 => 6
//        1 = 1
//        0 = 0
//        123 = 6
//        9999999 = 6 + 3 = 9
//
//    Создать класс, написать в нем статический метод, написать тесты на метод
//    Метод должен считать сумму цифр числа до тех пор, пока сумма не станет цифрой

    public static long sumNumbers(long num) {
        num = Math.abs(num);
        while (num > 9) {
            long sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }
        System.out.println(num);
        return num;
    }
}
