package martak;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {

    @Test
        public void shouldMultiply() {
            Dollar five = new Dollar(5);
            five.multiply(2);
            assertEquals(10, five.getAmount());
        }

}
