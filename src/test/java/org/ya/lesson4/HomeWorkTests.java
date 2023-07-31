package org.ya.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HomeWorkTests {

    //Генерация любых данных
    @Test
    void isSortedTest(){
        int[] array = MainClassWork.generateRandomArray(5, 0, 10);
        boolean actually = HomeWork4.isSorted(array);
        String answer;
        if (actually){
            answer = "YES";
        } else {
            answer = "NO";
        }
        System.out.println("This array is sorted?");
        System.out.println(answer);
    }

    public static Stream<Arguments> paramTrueData() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 2}),
                Arguments.of(new int[]{6, 3, 1}),
                Arguments.of(new int[]{1, 1}),
                Arguments.of(new int[]{0, 0, 0}));
    }

    //Через Stream
    @ParameterizedTest
    @MethodSource("paramTrueData")
    void isSortedTrueTest(int[] array) {
        boolean actually = HomeWork4.isSorted(array);
        Assertions.assertTrue(actually);
    }

    public static Stream<Arguments> paramMultiData() {
        return Stream.of(
                Arguments.of(new int[]{3, 8, 9, 10}, 90),
                Arguments.of(new int[]{1, 1, 1, 1}, 1),
                Arguments.of(new int[]{0, 1}, 0));
    }

    //Через Stream
    @ParameterizedTest
    @MethodSource("paramMultiData")
    void maxTwinMultiplyTest(int[] array, long multiply) {
        long actually = HomeWork4.maxTwinMultiply(array);
        Assertions.assertEquals(actually, multiply);
    }

    //Попробовать через ввод из файла
    public static Stream<Arguments> rleCompressParamTest() {
        return Stream.of(
                Arguments.of("aaaabbbcdd", "4(a)3(b)1(c)2(d)"),
                Arguments.of("abbabbcdcda", "3(a)4(b)2(c)2(d)"));
    }

    //Через Stream
    @ParameterizedTest
    @MethodSource("rleCompressParamTest")
    void rleCompressParamTest(String src, String result) {
        String actually = HomeWork4.rleCompress(src);
        Assertions.assertEquals(actually, result);
        System.out.println(src + " vs " + result);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "aaaabbbcdd, 4(a)3(b)1(c)2(d)",
            "v, 0(a)0(b)0(c)0(d)",
            "aaaaa, 5(a)0(b)0(c)0(d)"
    })
    void rleCompressCsvTest(String src, String result) {
        String actually = HomeWork4.rleCompress(src);
        Assertions.assertEquals(actually, result);
        System.out.println(src + " vs " + result);
    }

    //TODO Попробовать через ввод из файла
    @Test
    void rleDecompressTest(String src, String result) {
    }
}
