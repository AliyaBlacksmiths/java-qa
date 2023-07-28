package org.ya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
