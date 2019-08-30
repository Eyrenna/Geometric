package encinas;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CuadradoTest {

    private Figura cuadrado;

    @Before
    public void init() {
        cuadrado = new Cuadrado("Circulo", 2);
    }

    @Test
    public void areaTest() {
        assertEquals(4, cuadrado.area(), 0.0);
    }
}
