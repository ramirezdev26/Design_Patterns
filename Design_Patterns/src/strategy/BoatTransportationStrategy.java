package strategy;

public class BoatTransportationStrategy extends TransportationStrategy{
    @Override
    public void transport(int passengers) {
        System.out.println("The Boat transportation method was selected, it will took 6 hours to reach the destiny");
    }
}
