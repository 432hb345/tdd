package martak;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiplicationTest {

    @Test
    public void shouldMultiply() {
        Dollar five = new Dollar(5);
        Dollar product = five.multiply(2);
        assertEquals(new Dollar(10), product);
        product = five.multiply(3);
        assertEquals(new Dollar(15), product);
    }

    @Test
    public void testEquality() {
        Dollar five = new Dollar(5);
        assertTrue(new Dollar(10).equals(five.multiply(2)));
        assertFalse(new Dollar(10).equals(five.multiply(3)));
    }


}
