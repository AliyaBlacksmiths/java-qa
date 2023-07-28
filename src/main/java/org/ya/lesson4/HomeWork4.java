package org.ya.lesson4;

import java.util.Arrays;
import java.util.Objects;

public class HomeWork4 {

        /**
         * Функция должна проверять является ли переданный массив
         * отсортированным.
         * <p>
         * 1 2 3 3 4 5 -> true
         * 1 2 1 5 -> false
         * 5 4 1 -> true
         * */
       //TODO никак не могу победить эту задачу:(
        public static boolean isSorted(int[] array) {

            //  5 5 7
            // 7 7 5 4 6
            // 1 1 3 4
            if (array.length > 2) {//если два числа, то в любом случае отсортирован
                for (int i = 1; i < array.length - 1; i++) {
                    while (array[i] == array[i + 1]) {//не проверяем сортировку для одинаковых чисел
                        i++;
                    }
                    if ((array[i] <= array[i + 1]) && (array[i] >= array[i - 1])) {
                        continue;
                    }
                    if ((array[i] >= array[i + 1]) && (array[i] <= array[i - 1])) {
                        continue;
                    }
                    return false;
                }
            }
            return true;
        }


        /**
         * Функция должна возвращать максимальное произведение
         * двух элементов массива
         * Массив может состоять как из положительных, так и из
         * отрицательных чисел
         * 1 5 3 1 4 -> 4 * 5 = 20
         * */
        public static long maxTwinMultiply(int[] array) {
            Arrays.sort(array);

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        int maxNum = array[i];
                        array[i] = array[j];
                        array[j] = maxNum;
                    }
                }
            }
            return (long) array[0] * array[1];
        }

        // Две задачи ниже по желанию. Но они интересные
        /**
         * aaaabbbcdd -> 4(a)3(b)1(c)2(d)
         * abc -> 1(a)1(b)1(c)
         * aaaaaaaaaa -> 10(a)
         * */
        public static String rleCompress(String src) {
            //наверное тут можно использовать один count, просто его отчищать?
            int count_a = 0;
            int count_b = 0;
            int count_c = 0;
            int count_d = 0;

            char[] charArray = src.toCharArray();
            String[] strArray = new String[charArray.length];

            String result;
            for (int i = 0; i < charArray.length; i++){
                strArray[i] = String.valueOf(charArray[i]);

                if (Objects.equals(strArray[i], "a")){
                    count_a++;
                } else if (Objects.equals(strArray[i], "b")){
                    count_b++;
                } else if (Objects.equals(strArray[i], "c")){
                    count_c++;
                } else if (Objects.equals(strArray[i], "d")){
                    count_d++;
                }
            }
            return result = String.format("%d(a)%d(b)%d(c)%d(d)", count_a, count_b, count_c, count_d);
        }

        /**
         * 4(a)3(b)1(c)2(d) -> aaaabbbcdd
         * 1(a)1(b)1(c) -> abc
         * 10(a) -> aaaaaaaaaa
         * */
        public static String rleDecompress(String src) {

            return "";
        }
}
