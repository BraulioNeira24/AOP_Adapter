public class Main {

    public static void main(String[] args) {
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("   DEMOSTRACIÓN: PATRÓN ADAPTER CON AOP (AspectJ)");
        System.out.println("═══════════════════════════════════════════════════════\n");

        System.out.println("───────────────────────────────────────────────────────");
        System.out.println("PARTE 1: Auto WEC nativo (Hypercar - Compatible)");
        System.out.println("───────────────────────────────────────────────────────\n");

        WECRaceInterface hypercar = new Hypercar("Toyota GR010", 340, 95);
        hypercar.startRace();
        hypercar.displayInfo();

        System.out.println("\n✓ Hypercar funciona nativamente con WEC\n");

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("PARTE 2: Auto NASCAR (Incompatible → Adaptado por AOP)");
        System.out.println("═══════════════════════════════════════════════════════\n");

        Nascar nascar = new Nascar("Hendrick Motorsports", 850, "Slick");

        System.out.println("→ NASCAR creado con su interfaz original:");
        nascar.showNascarStats();

        System.out.println("\n→ Ahora NASCAR será tratado como WECRaceInterface:");
        System.out.println("   (gracias al aspecto AdapterAspect)\n");

        WECRaceInterface nascarAdaptado = nascar;

        nascarAdaptado.startRace();
        System.out.println();
        nascarAdaptado.displayInfo();

        System.out.println("\n✓ NASCAR ahora es compatible con WEC mediante AOP\n");

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("PARTE 3: Uso polimórfico (ambos como WECRaceInterface)");
        System.out.println("═══════════════════════════════════════════════════════\n");

        WECRaceInterface[] racers = {hypercar, nascar};

        System.out.println("→ Iniciando carrera WEC con todos los competidores:\n");

        for (int i = 0; i < racers.length; i++) {
            System.out.println("Competidor " + (i+1) + ":");
            racers[i].startRace();
            System.out.println("  Velocidad: " + racers[i].getMaxSpeed() + " km/h");
            System.out.println("  Aerodinámica: " + racers[i].getAerodynamics() + "/100");
            System.out.println();
        }

        System.out.println("✓ Ambos autos procesados uniformemente\n");

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("PARTE 4: Verificación de tipos (instanceof)");
        System.out.println("═══════════════════════════════════════════════════════\n");

        System.out.println("nascar instanceof Nascar: " + (nascar instanceof Nascar));
        System.out.println("nascar instanceof WECRaceInterface: " + 
                         (nascar instanceof WECRaceInterface));
        System.out.println("\n✓ NASCAR ahora implementa ambas interfaces\n");

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("           DEMOSTRACIÓN COMPLETADA");
        System.out.println("═══════════════════════════════════════════════════════");
    }
}