
public class Superman extends Kryptonian implements IFlyer {
    private String name;

    public Superman(String name) {
        this.name = name;
    }

    @Override
    public void takeOff() {
        System.out.println(name + " takes off");
    }

    @Override
    public void land() {
        System.out.println(name + " lands");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies");
    }

    public void leapBuilding() {
        System.out.println(name + " leaps over a building");
    }

    public void stopBullet() {
        System.out.println(name + " stops a bullet");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats");
    }
}