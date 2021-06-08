import java.util.ArrayList;

public class Bus {

    private String destination;
    private Integer capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, Integer capacity){
        this.passengers = new ArrayList<>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void addPassenger(Person person) {
        if (this.passengerCount() < this.capacity ){
            this.passengers.add(person);
        }
    }

    public void removePerson() {
        this.passengers.remove(0);
    }

    public void pickUpFromQueue(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        this.passengers.add(person);
    }
}
