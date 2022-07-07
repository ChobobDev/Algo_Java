package Level_1.hidePhoneNumber;

import org.junit.Test;
import static org.junit.Assert.*;

public class hidePhoneNumberTest {
    @Test
    public void testPhoneNUmber0() {
        assertEquals("*******4321",hidePhoneNumber.solution("01012344321"));
    }

    public void testPhoneNUmber1() {
        assertEquals("*********4321",hidePhoneNumber.solution("0101231244321"));
    }

}
