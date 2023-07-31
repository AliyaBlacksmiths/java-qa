package org.ya.lesson4;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.ya.IoUtils;

import static org.junit.jupiter.api.Assertions.*;

    class MainTests {

        public static Stream<Arguments> randomData() {
            int[] data = MainClassWork.generateRandomArray(30, 0, 100);
            return Stream.of(Arguments.of(
                    data, MainClassWork.findMinimum(data)
            ));
        }

        @ParameterizedTest
        @MethodSource("randomData")
        void findMinimum(int[] data, int expected) {
            int actually = MainClassWork.findMinimum(data);
            System.out.println(actually);
            assertEquals(expected, actually);
        }

        @ParameterizedTest
        @CsvSource("1234,'1 2 3 4'")
        void toArrayTest(int value, String array) {
            int[] expected = toIntArray(array);
            int[] actually = MainClassWork.toArray(value);
            System.out.println(IoUtils.readAsString("to-array-test/lesson4.txt.txt", MainTests.class));
            assertArrayEquals(expected, actually);
        }

        @Test
        void testFileResult() {

            try {
                File file = File.createTempFile("tmp", "_tmp");
                try (PrintWriter pr = new PrintWriter(file)) {
                    pr.println("Hello world!");
                }
                // /Users/mikelevin/IdeaProjects/java-qa/src/test/resources/ru/yandex/lesson4/expected.txt
                String expected = IoUtils.readAsString("expected.txt", MainTests.class);
                try (FileInputStream fis = new FileInputStream(file)) {
                    String actually  = new String(fis.readAllBytes());
                    Assertions.assertEquals(expected, actually);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        void assertFilesEquals(String expectedFilePath, String actuallyFilePath) {
        }

        // 1 2 3 4
        public int[] toIntArray(String str) {
            String[] strings = str.split(" ");
            int[] array = new int[strings.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(strings[i]);
            }
            return array;
        }
    }
