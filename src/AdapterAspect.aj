/**
 * AdapterAspect - Implementación CORREGIDA del patrón Adapter usando AOP
 * 
 * Este aspecto convierte la clase Nascar (incompatible) en compatible
 * con la interfaz WECRaceInterface SIN modificar el código original de Nascar.
 */
public aspect AdapterAspect {
    
    /**
     * PASO 1: Hacer que Nascar implemente WECRaceInterface
     */
    declare parents: Nascar implements WECRaceInterface;
    
    /**
     * PASO 2: Implementar startRace() en Nascar
     */
    public void Nascar.startRace() {
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  [ADAPTER] Adaptando NASCAR a WEC...    ║");
        System.out.println("╚══════════════════════════════════════════╝");
        this.beginNascarRace();
        System.out.println("[ADAPTER] NASCAR " + this.getTeamName() + 
                         " ahora compatible con formato WEC");
    }
    
    /**
     * PASO 3: Implementar getMaxSpeed() en Nascar
     */
    public int Nascar.getMaxSpeed() {
        int speed = this.calculateSpeed();
        System.out.println("[ADAPTER] Convirtiendo " + this.getHorsePower() + 
                         " HP → " + speed + " km/h");
        return speed;
    }
    
    /**
     * PASO 4: Implementar getAerodynamics() en Nascar
     */
    public int Nascar.getAerodynamics() {
        int aero = this.calculateAerodynamics();
        System.out.println("[ADAPTER] Convirtiendo neumático '" + 
                         this.getTireType() + "' → aerodinámica " + aero + "/100");
        return aero;
    }
    
    /**
     * PASO 5: Implementar displayInfo() en Nascar
     */
    public void Nascar.displayInfo() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║    NASCAR ADAPTADO - AHORA WEC COMPATIBLE      ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.println("║ Equipo: " + this.getTeamName());
        System.out.println("║ Caballos de Fuerza: " + this.getHorsePower() + " HP");
        
        // Calcular valores adaptados directamente para evitar recursión
        int speed = this.calculateSpeed();
        int aero = this.calculateAerodynamics();
        
        System.out.println("║ Velocidad Máxima: " + speed + " km/h (adaptada)");
        System.out.println("║ Tipo de Neumático: " + this.getTireType());
        System.out.println("║ Aerodinámica: " + aero + "/100 (adaptada)");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.println("║ ✓ Adaptación completada por AdapterAspect     ║");
        System.out.println("╚════════════════════════════════════════════════╝");
    }
}