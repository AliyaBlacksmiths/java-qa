package org.ya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.ya.lesson3.homeWork.SumOfNumbers;

public class HomeWorkTests {

    @Test
    void reverseTest() {
        int actually = HomeWork.reverse(1234);
        int expected = 4321;
        //TODO Вопрос, почему нижний закоменченный принт выводит 10, а не 1?
//        System.out.println(HomeWork.reverse(10));
        Assertions.assertEquals(expected, actually);
        Assertions.assertEquals(HomeWork.reverse(1000), 1);//тут как раз не значащие нули?
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
}
