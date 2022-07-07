package Level_1.evenOrOdd;

import org.junit.Test;
import static org.junit.Assert.*;

public class evenOrOddTest {
    @Test
    public void TestEvenOrOdd0(){
        assertEquals("Odd",evenOrOdd.solution(3));
    }

    @Test
    public void TestEvenOrOdd1(){
        assertEquals("Even",evenOrOdd.solution(6));
    }

    @Test
    public void TestEvenOrOdd2(){
        assertEquals("Odd",evenOrOdd.solution(13));
    }
}
