package Level_1.harshadNumber;

import Level_1.hidePhoneNumber.hidePhoneNumber;
import org.junit.Test;
import static org.junit.Assert.*;

public class harshadNumberTest {
    @Test
    public void testHarshadNUmber0() {
        assertEquals(true,harshadNumber.solution(18));
    }
    @Test
    public void testHarshadNUmber1() {
        assertEquals(true,harshadNumber.solution(12));
    }
    @Test
    public void testHarshadNUmber2() {
        assertEquals(false,harshadNumber.solution(11));
    }
    @Test
    public void testHarshadNUmber3() {
        assertEquals(false,harshadNumber.solution(13));
    }


}
