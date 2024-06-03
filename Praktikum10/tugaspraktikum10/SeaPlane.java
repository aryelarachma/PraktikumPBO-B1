public class SeaPlane extends Airplane {
    private double maxLoad;

    public SeaPlane() {
        this.maxLoad = 5000; 
    }

    @Override
    public double calcFuelEfficiency() {
        return maxLoad / 8; 
    }

    @Override
    public double calcTripDistance() {
        return maxLoad / 3; 
    }

    @Override
    public void takeOff() {
        System.out.println("SeaPlane takes off");
    }

    @Override
    public void land() {
        System.out.println("SeaPlane lands");
    }

    @Override
    public void fly() {
        System.out.println("SeaPlane flies");
    }

    @Override
    public String toString() {
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}