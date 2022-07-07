package Level_1.dotProduct;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class dotProductTest {
    @Test
    public void testDotProduct0(){
        int[] a={1,2,3,4};
        int[] b={-3,-1,0,2};
        assertEquals(3,dotProduct.solution(a,b));
    }

    @Test
    public void testDotProduct1(){
        int[] a={-1,0,1};
        int[] b={1,0,-1};
        assertEquals(-2,dotProduct.solution(a,b));
    }

}
