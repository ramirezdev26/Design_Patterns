package strategy;

public class SelecterTransportationStrategy {
    private TransportationStrategy transportationStrategy;

    public void setTransportationStrategy (TransportationStrategy transportationStrategy){
        this.transportationStrategy = transportationStrategy;
    }

    public void selectTransportation(int passengers) {
        transportationStrategy.transport(passengers);
    }
}
