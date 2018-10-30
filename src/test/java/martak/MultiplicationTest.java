package martak;


import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Test
    public void shouldMultiplyDollar() {
        Dollar five = new Dollar(5);
        Dollar product = five.multiply(2);
        assertEquals(new Dollar(10), product);
        product = five.multiply(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    public void testEquality() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.multiply(2));
        assertEquals(new Dollar(15), five.multiply(3));
        assertTrue(new Franc(10).equals(new Franc(10)));
        assertFalse(new Franc(10).equals(new Franc(115)));
        assertFalse(new Franc(10).equals(new Dollar(10)));
    }

    @Test
    public void shouldMultiplyFranc() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.multiply(2));
        assertEquals(new Franc(15), five.multiply(3));
    }


}
