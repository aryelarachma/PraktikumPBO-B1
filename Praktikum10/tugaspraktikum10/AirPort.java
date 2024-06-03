public class AirPort {
    private Airplane airplane;
    private String name;

    public AirPort(String name, Airplane airplane) {
        this.name = name;
        this.airplane = airplane;
    }

    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Permission granted to land.";
        } else {
            return "Permission denied. Only airplanes are allowed to land.";
        }
    }
}