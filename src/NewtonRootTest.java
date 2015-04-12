import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by @Author Markus Marihart
 * @version 1.0
 *
 */
public class NewtonRootTest {

    @Test
    public void testSquareRoot() throws Exception {
        double n = 49;
        double result;
        result = NewtonRoot.squareRoot(n);
        assertEquals(Math.sqrt(n), result, 0.000001);

        n = 0.5;
        result = NewtonRoot.squareRoot(n);
        assertEquals(Math.sqrt(n), result, 0.000001);

        n = 0.1;
        result = NewtonRoot.squareRoot(n);
        assertEquals(Math.sqrt(n), result, 0.000001);

        n = 0.0005;
        result = NewtonRoot.squareRoot(n);
        assertEquals(Math.sqrt(n), result, 0.000001);

    }

    @Test
    public void testCubicRoot() throws Exception {
        double n = 34;
        double result;
        result = NewtonRoot.cubicRoot(n);
        assertEquals(Math.cbrt(n),result, 0.000001);

        n = 0.5;
        result = NewtonRoot.cubicRoot(n);
        assertEquals(Math.cbrt(n), result, 0.000001);

        n = 0.1;
        result = NewtonRoot.cubicRoot(n);
        assertEquals(Math.cbrt(n), result, 0.000001);

        n = 0.0005;
        result = NewtonRoot.cubicRoot(n);
        assertEquals(Math.cbrt(n), result, 0.000001);
    }
}