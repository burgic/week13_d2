import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Vehicle vehicle1;
    private Vehicle vehicle2;
    private Vehicle vehicle3;

    @Before
    public void before(){
        dealership = new Dealership("Hybrid", 10000);
        vehicle1 = new Vehicle("Hybrid");
        vehicle2 = new Vehicle("Electric");
    }

//        vehicle = new Vehicle();
//        dealership = new Dealership();
//        till = new Till();


    @Test
    public void hasTill(){
        assertEquals(10000, dealership.getTill());
    }

//    @Test
//    public void hasDifferentTypesOfCars(){
//        assertEquals("Hybrid", "Electric");
//    }

    @Test
    public void hasDifferentTypes(){
        dealership.addVehicle(vehicle1);
        dealership.addVehicle(vehicle2);
        assertEquals(2, dealership.getVehicle());
    }

}
