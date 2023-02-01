package strategy;

public class AirTransportationStrategy extends TransportationStrategy{
    @Override
    public void transport(int passengers) {
        System.out.println("The Air transportation method was selected, it will took 2 hours to reach the destiny");
    }
}
