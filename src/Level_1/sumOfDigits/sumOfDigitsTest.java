package Level_1.sumOfDigits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class sumOfDigitsTest {
    @Test
    public void testSumOfDigits0() {
        assertEquals(9, sumOfDigits.solution(18));
    }
    @Test
    public void testSumOfDigits1() {
        assertEquals(3,sumOfDigits.solution(12));
    }
    @Test
    public void testSumOfDigits2() {
        assertEquals(2,sumOfDigits.solution(11));
    }
    @Test
    public void testSumOfDigits3() {
        assertEquals(4,sumOfDigits.solution(13));
    }


}
