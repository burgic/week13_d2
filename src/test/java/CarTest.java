import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private HybridCar hybridCar;

    @Before
    public void before() {hybridCar = new HybridCar("Prius", 15000, "Mauve", "Gazelle", 1500, 50);}

    @Test
    public void canGetHybridName() {
        assertEquals("Prius", hybridCar.getName());
    }

    @Test
    public void canGetHybridPrice () {
        assertEquals(15000, hybridCar.getPrice());
    }



}
