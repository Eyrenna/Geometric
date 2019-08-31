package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectanguloTest {

    //Variables

    private Figura rectangulo;

    @Before
    public void init() {
        rectangulo = new Rectangulo("rectangulo", 2,3);
    }

    @Test
    public void areaTest() {
        assertEquals(6, rectangulo.area(), 0.0);
    }
}
