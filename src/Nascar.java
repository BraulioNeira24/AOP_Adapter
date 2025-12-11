public class Nascar {

    private String teamName;
    private int horsePower;
    private String tireType;

    public Nascar(String teamName, int horsePower, String tireType) {
        this.teamName = teamName;
        this.horsePower = horsePower;
        this.tireType = tireType;
    }

    public void beginNascarRace() {
        System.out.println("[NASCAR] Equipo " + teamName + " comenzando en óvalo NASCAR...");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getTireType() {
        return tireType;
    }

    public String getTeamName() {
        return teamName;
    }

    public void showNascarStats() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║       NASCAR - NO COMPATIBLE       ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Equipo: " + teamName);
        System.out.println("║ Caballos de Fuerza: " + horsePower + " HP");
        System.out.println("║ Tipo de Neumático: " + tireType);
        System.out.println("╚════════════════════════════════════╝");
    }

    public int calculateSpeed() {
        return (int)(horsePower * 0.4);
    }

    public int calculateAerodynamics() {
        switch(tireType.toLowerCase()) {
            case "slick": return 85;
            case "racing": return 75;
            case "street": return 60;
            default: return 50;
        }
    }
}
