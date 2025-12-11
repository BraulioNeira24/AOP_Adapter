public aspect AdapterAspect {

    declare parents: Nascar implements WECRaceInterface;

    public void Nascar.startRace() {
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║  [ADAPTER] Adaptando NASCAR a WEC...    ║");
        System.out.println("╚══════════════════════════════════════════╝");
        this.beginNascarRace();
        System.out.println("[ADAPTER] NASCAR " + this.getTeamName() + 
                         " ahora compatible con formato WEC");
    }

    public int Nascar.getMaxSpeed() {
        int speed = this.calculateSpeed();
        System.out.println("[ADAPTER] Convirtiendo " + this.getHorsePower() + 
                         " HP → " + speed + " km/h");
        return speed;
    }

    public int Nascar.getAerodynamics() {
        int aero = this.calculateAerodynamics();
        System.out.println("[ADAPTER] Convirtiendo neumático '" + 
                         this.getTireType() + "' → aerodinámica " + aero + "/100");
        return aero;
    }

    public void Nascar.displayInfo() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║    NASCAR ADAPTADO - AHORA WEC COMPATIBLE      ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        System.out.println("║ Equipo: " + this.getTeamName());
        System.out.println("║ Caballos de Fuerza: " + this.getHorsePower() + " HP");

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