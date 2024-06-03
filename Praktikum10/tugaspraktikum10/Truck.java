public class Truck extends Vehicle {
    private double maxLoad;

    public Truck() {
        this.maxLoad = 10000; 
    }

    @Override
    public double calcFuelEfficiency() {
        return maxLoad / 10; 
    }

    @Override
    public double calcTripDistance() {
        return maxLoad / 5; 
    }

    @Override
    public String toString() {
        return "Truck adalah angkutan darat yang sangat handal";
    }
}