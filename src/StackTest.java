import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    private StackImplementation<Integer> pilaLimite;

    @Before
    public void setUp() throws Exception
    {
        pilaLimite = new StackImplementation<>(5);
        pilaLimite.push(1);
        pilaLimite.push(2);
    }
    @Test(expected = PilaLlenaException.class)
    public void testPlena() throws Exception
    {
        pilaLimite.push(3);
        pilaLimite.push(4);
        pilaLimite.push(5);
        pilaLimite.push(3);
    }
    @Test(expected=PilaVaciaException.class)
    public void testBuida() throws Exception
    {
        pilaLimite.pop();
        pilaLimite.pop();
        pilaLimite.pop();
        assertEquals(0, pilaLimite.size());
    }


    @After
    public void setDown() throws Exception
    {
        pilaLimite = null;
    }
}
