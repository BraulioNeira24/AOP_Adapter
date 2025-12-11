/**
 * Clase Nascar - INCOMPATIBLE con WECRaceInterface
 * Esta clase tiene su propia interfaz que NO coincide con WEC
 * Necesita un adaptador para funcionar en el sistema WEC
 */
public class Nascar {
    
    private String teamName;
    private int horsePower;
    private String tireType;
    
    public Nascar(String teamName, int horsePower, String tireType) {
        this.teamName = teamName;
        this.horsePower = horsePower;
        this.tireType = tireType;
    }
    
    /**
     * Método específico de NASCAR - NO compatible con WEC
     */
    public void beginNascarRace() {
        System.out.println("[NASCAR] Equipo " + teamName + " comenzando en óvalo NASCAR...");
    }
    
    /**
     * NASCAR mide en caballos de fuerza, no en velocidad directa
     */
    public int getHorsePower() {
        return horsePower;
    }
    
    /**
     * NASCAR usa tipo de neumáticos, no aerodinámica
     */
    public String getTireType() {
        return tireType;
    }
    
    public String getTeamName() {
        return teamName;
    }
    
    /**
     * Método específico de NASCAR para mostrar información
     */
    public void showNascarStats() {
        System.out.println("╔════════════════════════════════════╗");
        System.out.println("║       NASCAR - NO COMPATIBLE       ║");
        System.out.println("╠════════════════════════════════════╣");
        System.out.println("║ Equipo: " + teamName);
        System.out.println("║ Caballos de Fuerza: " + horsePower + " HP");
        System.out.println("║ Tipo de Neumático: " + tireType);
        System.out.println("╚════════════════════════════════════╝");
    }
    
    /**
     * Convierte HP a velocidad aproximada (fórmula simplificada)
     */
    public int calculateSpeed() {
        // Fórmula aproximada: 1 HP ≈ 0.4 km/h para NASCAR
        return (int)(horsePower * 0.4);
    }
    
    /**
     * Convierte tipo de neumático a nivel de aerodinámica
     */
    public int calculateAerodynamics() {
        switch(tireType.toLowerCase()) {
            case "slick": return 85;
            case "racing": return 75;
            case "street": return 60;
            default: return 50;
        }
    }
}
