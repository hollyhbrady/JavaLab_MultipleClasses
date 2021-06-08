import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    Person person;
    BusStop busStop;

    @Before
    public void before(){
        person = new Person();
        busStop = new BusStop("Bathgate");
    }

    @Test
    public void doesBusStopHaveName(){
        assertEquals("Bathgate", busStop.getBusStopName());
    }

    @Test
    public void doesBusStopHaveEmptyQueue(){
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void canAddPersonToQueue(){
        busStop.addPersonToQueue(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busStop.addPersonToQueue(person);
        busStop.addPersonToQueue(person);
        busStop.removePersonFromQueue();
        assertEquals(1,busStop.getQueueLength());
    }

}
