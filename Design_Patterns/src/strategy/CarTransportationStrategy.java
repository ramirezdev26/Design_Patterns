package strategy;

public class CarTransportationStrategy extends TransportationStrategy{
    @Override
    public void transport(int passengers) {
        System.out.println("The Car transportation method was selected, it will took 12 hours to reach the destiny");
    }
}
