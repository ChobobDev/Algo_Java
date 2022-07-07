package Level_1.incompleteRunner;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class incompleteRunnerTest {
    @Test
    public void testIncompleteRunner0(){
        String[] participant={"Bernie","Jeong","Stevey","Henry","Minsu"};
        String[] complete = {"Jeong","Stevey","Henry","Minsu"};
        assertEquals("Bernie",incompleteRunner.solution(participant,complete));
    }

    @Test
    public void testIncompleteRunner1(){
        String[] participant={"Bernie","Jeong","Stevey","Henry","Minsu","Bernie"};
        String[] complete = {"Jeong","Stevey","Henry","Minsu","Bernie"};
        assertEquals("Bernie",incompleteRunner.solution(participant,complete));
    }
}
