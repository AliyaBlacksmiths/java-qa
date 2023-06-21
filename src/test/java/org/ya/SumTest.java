package org.ya;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumTest {
    @Test
    void testSum() {
        int actually = Func.sum(1, 2);
        int expected = 3;
        Assertions.assertEquals(expected, actually);
    }
}
