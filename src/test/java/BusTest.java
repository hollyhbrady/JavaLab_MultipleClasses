import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    
    Bus bus;
    Person person;

    @Before
    public void before(){
        person = new Person();
        bus = new Bus("Glasgow", 3);
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busHasDestination() {
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void busHasCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void checkCapacityWhenAddingPassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.removePerson();
        assertEquals(1, bus.passengerCount());
    }



}
