package martak;


import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void shouldMultiplyDollar() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.multiply(2));
        assertEquals(Money.dollar(15), five.multiply(3));
    }

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(15), Money.dollar(10));
        assertEquals(Money.franc(10), Money.franc(10));
        assertNotEquals(Money.franc(15), Money.franc(10));
        assertNotEquals(Money.franc(10), Money.dollar(10));
    }

    @Test
    public void shouldMultiplyFranc() {
        Money five = Money.franc(5);
        assertEquals(Money.franc(10), five.multiply(2));
        assertEquals(Money.franc(15), five.multiply(3));
    }


}
