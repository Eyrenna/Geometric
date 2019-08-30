package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CirculoTest {

    private Figura circulo;

    @Before
    public void init() {
        circulo = new Circulo("Circulo", 2);
    }

    @Test
    public void areaTest() {
        assertEquals(12.56, circulo.area(), 0.01);
    }
}
