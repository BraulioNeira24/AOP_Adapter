public class Hypercar implements WECRaceInterface {

    private String model;
    private int maxSpeed;
    private int aerodynamics;

    public Hypercar(String model, int maxSpeed, int aerodynamics) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.aerodynamics = aerodynamics;
    }

    @Override
    public void startRace() {
        System.out.println("[HYPERCAR] " + model + " iniciando carrera WEC...");
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getAerodynamics() {
        return aerodynamics;
    }

    @Override
    public void displayInfo() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║       HYPERCAR - WEC COMPATIBLE    ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Modelo: " + model);
        System.out.println("║ Velocidad Máxima: " + maxSpeed + " km/h");
        System.out.println("║ Aerodinámica: " + aerodynamics + "/100");
        System.out.println("╚════════════════════════════════════╝");
    }
}