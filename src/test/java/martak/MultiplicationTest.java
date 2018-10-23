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
        assertEquals(10, product.getAmount());
        product = five.multiply(3);
        assertEquals(15, product.getAmount());
    }

    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }


}
