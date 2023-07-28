package org.ya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ya.lesson3.homeWork.SumOfNumbers;
import org.ya.lesson4.HomeWork4;

public class HomeWorkTests {

    @Test
    void reverseTest() {
        int actually = HomeWork.reverse(1234);
        int expected = 4321;
        Assertions.assertEquals(expected, actually);
        Assertions.assertEquals(HomeWork.reverse(1000), 1);
        Assertions.assertEquals(Integer.toString(actually).length(), 4);
    }

    @Test
    void differenceTest(){
        int actually = HomeWork.difference(7968);
        int expected = 79 - 68;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void sumTest() {
        long inputNum = SumOfNumbers.sumNumbers(55557);
        long expected = 9;
        Assertions.assertEquals(expected, inputNum);
        Assertions.assertEquals(SumOfNumbers.sumNumbers(-55557), expected);
        Assertions.assertEquals(SumOfNumbers.sumNumbers(1), 1);
        Assertions.assertEquals(SumOfNumbers.sumNumbers(0), 0);
        Assertions.assertEquals(SumOfNumbers.sumNumbers(10000), 1);
        Assertions.assertEquals(SumOfNumbers.sumNumbers(10000), 1);
    }

    @Test
    void productMaxElementsTest(){
        int[] array =  {1, 100, 100, 35, 0, 6};
        long actually = HomeWork4.maxTwinMultiply(array);
        long expected = 10000;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void isSortedTrueTest(){
        int[] array =  {7, 7, 5, 4};
        boolean actually = HomeWork4.isSorted(array);
        Assertions.assertTrue(actually);
    }

    @Test
    void isSortedFalseTest(){
        int[] array =  {7, 7, 8, 3, 1};
        boolean actually = HomeWork4.isSorted(array);
        Assertions.assertFalse(actually);
    }

    @Test
    void countLetters(){
        String src =  "aaabbbddca";
        String actually = HomeWork4.rleCompress(src);
        System.out.println(actually);
    }
}
