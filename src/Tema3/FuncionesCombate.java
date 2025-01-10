package Tema3;

import java.util.Random;

public class FuncionesCombate {

    public static void title() {

        System.out.println(
                """
                        $$$$$$$$\\ $$\\                                                                     $$\\                                                                                      \s
                        $$  _____|$$ |                                                                    $$ |                                                                                     \s
                        $$ |      $$ |            $$\\ $$\\   $$\\  $$$$$$\\   $$$$$$\\   $$$$$$\\         $$$$$$$ | $$$$$$\\         $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$\\   $$$$$$$\\  $$$$$$\\ \s
                        $$$$$\\    $$ |            \\__|$$ |  $$ |$$  __$$\\ $$  __$$\\ $$  __$$\\       $$  __$$ |$$  __$$\\       $$  __$$\\ $$  __$$\\ $$  __$$\\  \\____$$\\ $$  __$$\\ $$  _____|$$  __$$\\\s
                        $$  __|   $$ |            $$\\ $$ |  $$ |$$$$$$$$ |$$ /  $$ |$$ /  $$ |      $$ /  $$ |$$$$$$$$ |      $$ /  $$ |$$$$$$$$ |$$ /  $$ | $$$$$$$ |$$ |  \\__|\\$$$$$$\\  $$$$$$$$ |
                        $$ |      $$ |            $$ |$$ |  $$ |$$   ____|$$ |  $$ |$$ |  $$ |      $$ |  $$ |$$   ____|      $$ |  $$ |$$   ____|$$ |  $$ |$$  __$$ |$$ |       \\____$$\\ $$   ____|
                        $$$$$$$$\\ $$ |            $$ |\\$$$$$$  |\\$$$$$$$\\ \\$$$$$$$ |\\$$$$$$  |      \\$$$$$$$ |\\$$$$$$$\\       $$$$$$$  |\\$$$$$$$\\ \\$$$$$$$ |\\$$$$$$$ |$$ |      $$$$$$$  |\\$$$$$$$\\\s
                        \\________|\\__|            $$ | \\______/  \\_______| \\____$$ | \\______/        \\_______| \\_______|      $$  ____/  \\_______| \\____$$ | \\_______|\\__|      \\_______/  \\_______|
                                            $$\\   $$ |                    $$\\   $$ |                                          $$ |                $$\\   $$ |                                       \s
                                            \\$$$$$$  |                    \\$$$$$$  |              Versión - 1.2               $$ |                \\$$$$$$  |                                       \s
                                             \\______/                      \\______/                                           \\__|                 \\______/                                        \s""");

    }

    public static void tutorial(){

        System.out.println(" ");
        System.out.println("■ ACCIONES DE COMBATE:");
        System.out.println(" ");
        System.out.println("Atacar: Golpearás al enemigo. Los golpes pueden ser normales (daño base, basado en la fórmula), críticos (daño x2), o súper críticos (daño x3).");
        System.out.println(" ");
        System.out.println("Regenerar: Recuperarás parte de tu vida. La fórmula favorece a jugadores con la vida máxima más alta (a más vida máxima, más regeneras).");
        System.out.println(" ");
        System.out.println("Pedir perdón: Le pedirás perdón al enemigo. Tendrás un 1% de posibilidades de que se compadezca de ti, haciendo que ganes la pelea automáticamente.");
        System.out.println(" ");
        System.out.println("Canalizar: Gastarás el turno en acumular energía, haciendo que tu siguiente ataque cause el doble de daño.");
        System.out.println(" ");
        System.out.println("Reflejar: Si el enemigo te ha atacado, absorberás su ataque más reciente, y sumarás su valor a tu siguiente ataque.");
        System.out.println("(Si el enemigo te hace 10, y eliges reflejar, tu siguiente ataque hará X + 10)");
        System.out.println(" ");
        System.out.println("El reflejo solo tiene una probabilidad de acierto del 50%, y, si fallas, se te causará la mitad del daño que has intentado reflejar.");
        System.out.println("(Si el enemigo te hace 10, y eliges reflejar, pero fallas, recibirás 5 de daño)");
        System.out.println(" ");
        System.out.println("■ MODOS DE DIFICULTAD:");
        System.out.println(" ");
        System.out.println("Descerebrado: La IA escogerá los movimientos de forma aleatoria.");
        System.out.println(" ");
        System.out.println("Cerebrado: La IA escogerá los movimientos óptimos dependiendo de la situación, emulando las decisiones que podría tomar un jugador real.");
        System.out.println(" ");
        System.out.println("■ TRUCOS Y CONSEJOS:");
        System.out.println(" ");
        System.out.println("Si reflejas un ataque con éxito, puedes canalizar el golpe antes de atacar, resultando en más daño.");
        System.out.println(" ");
        System.out.println("Si tienes más velocidad que tu enemigo, tendrás una probabilidad de un 25% de actuar dos turnos seguidos. No descuides la velocidad, los turnos extra pueden darte ventaja.");
        System.out.println(" ");

    }

    public static void classInfo(){

        System.out.println(" ");
        System.out.println("1. TRABAJADOR DE PISCIFACTORÍA");
        System.out.println("El arte del pez es uno de sabiduría, paciencia, y vocación... pero también de sed de sangre.");
        System.out.println("Vida: 105 | Ataque: 175 | Defensa: 80 | Velocidad: 140");
        System.out.println(" ");

        System.out.println("2. FUMADOR COMPULSIVO");
        System.out.println("Años de fumar un paquete al día han hecho de tí un monstruo, vacío, irreconocible, nervioso, letál. También conocido como Pau Albarracín.");
        System.out.println("Vida: 70 | Ataque: 155 | Defensa: 75 | Velocidad: 200");
        System.out.println(" ");

        System.out.println("3. PROFESOR DE FOL");
        System.out.println("Los vídeos de prevención de riesgos te han desensibilizado a la violencia. Es tu hora de repartir.");
        System.out.println("Vida: 145 | Ataque: 110 | Defensa: 120 | Velocidad: 125");
        System.out.println(" ");

        System.out.println("4. SEÑOR DE 2 METROS");
        System.out.println("Mides 2 metros.");
        System.out.println("Vida: 150 | Ataque: 90 | Defensa: 180 | Velocidad: 80");
        System.out.println(" ");

        System.out.println("5. APOLINAR");
        System.out.println("Eres Apolinar Zaera.");
        System.out.println("Vida: 200 | Ataque: 99 | Defensa: 200 | Velocidad: 1");
        System.out.println(" ");

        System.out.println("6. ERIC");
        System.out.println("Especialmente diseñado para derrotar a Apolinar Zaera.");
        System.out.println("Vida: 150 | Ataque: 200 | Defensa: 148 | Velocidad: 2");
        System.out.println(" ");

    }

    public static void combatMenuJ1(String className){

        System.out.println("Jugador 1" + " (" + className + ")" + " - Elige una acción:");
        System.out.println("1. Ataque | 2. Regenerar | 3. Pedir Perdón | 4. Canalizar | 5. Reflejar");
        System.out.println(" ");

    }

    public static void combatMenuJ2(String className){

        System.out.println("Jugador 2" + " (" + className + ")" + " - Elige una acción:");
        System.out.println("1. Ataque | 2. Regenerar | 3. Pedir Perdón | 4. Canalizar | 5. Reflejar");
        System.out.println(" ");

    }

    public static void statOverflow(){

        System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
        System.out.println(" ");

    }

    public static void statMaxOverflow(){

        System.out.println("La suma total de los atributos no puede superar 500.");
        System.out.println(" ");

    }

    public static void statCheck(int statsTotal, int statsLeft){

        if (statsTotal > 500) {
            System.out.println("Cuidado: Te has pasado del límite de puntos asignables. Termina la asignación y vuelve a empezar.");
        } else if (statsLeft <= 0) {
            System.out.println("Cuidado: No te quedan puntos por asignar. Termina la asignación y vuelve a empezar.");
        } else System.out.println("Te quedan " + statsLeft + " por asignar.");
        System.out.println(" ");

    }

    public static void characterPreview(String p1_className, int p1_health, int p1_attack, int p1_defense, int p1_speed, String p2_className, int p2_health, int p2_attack, int p2_defense, int p2_speed){

        System.out.println("Jugador 1" + " (" + p1_className + ")" + ":");
        System.out.println("Vida: " + p1_health + " Ataque: " + p1_attack + " Defensa: " + p1_defense + " Velocidad: " + p1_speed);
        System.out.println(" ");
        System.out.println("Jugador 2" + " (" + p2_className + ")" + ":");
        System.out.println("Vida: " + p2_health + " Ataque: " + p2_attack + " Defensa: " + p2_defense + " Velocidad: " + p2_speed);
        System.out.println(" ");

    }

    public static int startingTurn(int p1_speed, int p2_speed){

        int turn = 0;

        if (p1_speed > p2_speed) {
            turn = 1;
        } else turn = 2;

        return turn;

    }

    public static void roundCounter(int round){

        System.out.println(" ");
        System.out.print("RONDA " + round);

    }

    public static void turnCounter(int turn){

        if (turn == 1){

            System.out.print(" - TURNO DEL JUGADOR 1");

        } else System.out.print(" - TURNO DEL JUGADOR 2");

        System.out.println(" ");

    }

    public static void healthCombatDisplay(String p1_className, int p1_health, String p2_className, int p2_health){

        System.out.println("Jugador 1" + " (" + p1_className + ")");
        System.out.print("Vida: " + p1_health + " ");

        for (int i = 0; i < p1_health; i = i + 2){
            System.out.print("■");
        }

        System.out.println(" ");
        System.out.println("Jugador 2" + " (" + p2_className + ")");
        System.out.print("Vida: " + p2_health + " ");

        for (int i = 0; i < p2_health; i = i + 2){
            System.out.print("■");
        }

        System.out.println(" ");

    }

    public static int attack(double attackChance, double defenseChance, int attackRoll, int attackCalc, int attack, double channeling, int defense, int counter){

        Random roll = new Random();

        attackChance = roll.nextDouble(0.2, 0.4);
        defenseChance = roll.nextDouble(0.1, 0.2);

        attackRoll = roll.nextInt(1, 4);

        attackCalc = (int) (((attack * attackChance * 3 * channeling) * attackRoll) / (defense * defenseChance) + counter);

        System.out.println("""

                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⡆⢀⣤⣤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                    ⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢀⣀⣤⣀⠀⠀⠀⠀⠀⠀⠀
                                    ⠀⠀⠀⠀⠀⠀⠀⢀⣿⣿⣿⣿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣀⡀⠀⠀⠀⠀
                                    ⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⡟⢀⣿⣿⣿⣿⡟⢻⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⠀
                                    ⠀⠀⠀⠀⢠⠆⢰⣿⣿⣿⣿⠁⣼⣿⣿⣿⡿⠀⣼⣿⣿⣿⠿⢿⣿⣿⣿⠇⠀⠀
                                    ⠀⠀⠀⠀⣿⠀⣾⣿⣿⣿⡟⢰⣿⣿⣿⣿⠃⣸⣿⣿⣿⠏⢠⣿⣿⣿⡿⠀⠀⠀
                                    ⠀⠀⠀⢸⡇⢠⣿⣿⣿⡿⠀⣾⣿⣿⣿⠇⢠⣿⣿⣿⡏⢠⣿⣿⣿⣿⠁⠀⠀⠀
                                    ⠀⠀⠀⣾⣧⡈⠛⢿⣿⠃⣸⣿⣿⣿⡏⢠⣿⣿⣿⡟⢀⣾⣿⣿⣿⠃⠀⠀⠀⠀
                                    ⠀⠀⠀⠿⣿⣿⣶⣄⡉⠀⢿⣿⣿⡟⠀⣾⣿⣿⡿⢀⣾⣿⣿⡿⠁⠀⠀⠀⠀⠀
                                    ⠀⠀⠀⠀⠈⠉⠛⠛⠛⠒⠀⠈⠉⠁⠸⠿⠿⠿⠃⠾⠿⠟⠋⠀⠀⠀⠀⠀⠀⠀
                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
                                    ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀""");

        if (channeling == 2) System.out.println("¡Golpe canalizado!");
        if (counter > 0) System.out.println("¡Golpe reflejado!");

        if (attackRoll == 3){
            System.out.println("¡Golpe Súper Crítico!");
        } else if (attackRoll == 2) {
            System.out.println("¡Golpe Crítico!");
        } else System.out.println("Has golpeado al jugador 2.");
        System.out.println(" ");

        return attackCalc;

    }

    public static int regen(int regenRoll, double regenChance, int regen, int healthMAX){

        Random roll = new Random();

        regenRoll = roll.nextInt(1, 3);
        regenChance = roll.nextDouble(0.5, 0.9);

        regen = (int) (regenRoll + (healthMAX * regenChance) * 0.2);

        return regen;

    }

    public static void maxHealthCheck(int health, int healthMAX){

        if (health > healthMAX) {

            health = healthMAX;

            System.out.println("Tu vida está al máximo.");
            System.out.println(" ");

        }

    }

    public static void regenGraphic(){

        System.out.println("""
                                        
                                                                  \s
                                           _                _     \s
                                         _| |_            _| |_   \s
                                        |_   _|          |_   _|  \s
                                          |_|              |_|    \s
                                                                  \s
                                                                  \s
                                                     _            \s
                                                   _| |_          \s
                                                  |_   _|         \s
                                                    |_|           \s
                                                                  \s
                                                                  \s
                                              _                _  \s
                                            _| |_            _| |_\s
                                           |_   _|          |_   _|
                                             |_|              |_| \s
                                                                  \s
                                        """);

    }

    public static int forgive(int pity){

        Random roll = new Random();

        System.out.println("""
                                              _.-/`)
                                             // / / )
                                          .=// / / / )
                                         //`/ / / / /
                                        // /     ` /
                                       ||         /
                                        \\\\       /
                                         ))    .'
                                        //    /
                                             /""");
        System.out.println(" ");

        System.out.println("¡Pides perdón!");

        pity = roll.nextInt(0, 101);

        return pity;

    }

    public static int channeling(double channeling){

        System.out.println("¡Has canalizado energía!");
        System.out.println("Tu siguiente ataque será más poderoso.");
        System.out.println(" ");

        channeling = 2;

        return (int) channeling;

    }

    public static void turnWasted(){

        System.out.println(" ");
        System.out.println("Desperdiciaste el turno.");
        System.out.println(" ");

    }

    public static int computerAI(int p1_attackCalc, int choice_p2, double p2_channeling, int p2_healthMAX, int computerHealthRoll){

        Random roll = new Random();

        if (p1_attackCalc == 0) {

            choice_p2 = 1;

        } else choice_p2 = roll.nextInt(1, 3);

        if (choice_p2 == 2) choice_p2 = 4;

        if (p2_channeling == 2) choice_p2 = 1;

        if (p1_attackCalc > 14) choice_p2 = 5;

        if (p2_healthMAX < p2_healthMAX / 2) {

            computerHealthRoll = roll.nextInt(1, 3);

            if (computerHealthRoll == 2) choice_p2 = 2;

        } else choice_p2 = 1;

        return choice_p2;

    }

    public static void winCheckCOM(int p1_health, int p2_health){

        if (p1_health > p2_health){
            System.out.println("¡Ha ganado el jugador 1!");

        } else System.out.println("¡Ha ganado la máquina!");

    }

    public static void winCheckPJ(int p1_health, int p2_health){

        if (p1_health > p2_health){
            System.out.println("¡Ha ganado el jugador 1!");

        } else System.out.println("¡Ha ganado el jugador 2!");

    }

    public static int doubleTurnP1(int p1_speed, int p2_speed, int p1_speedRoll, int turn, int p2_health){

        Random roll = new Random();

        if (p1_speed > p2_speed) {

            p1_speedRoll = roll.nextInt(1, 5);

            if (p1_speedRoll == 4) {

                turn = 1;

                System.out.println("■ ! ■ ! ■ ¡Eres más rápido que tu oponente! Actúas otro turno. ■ ! ■ ! ■");
                System.out.println(" ");

            }

            if (p2_health == 0) turn = 2;
        }

        return turn;

    }

    public static int doubleTurnP2(int p2_speed, int p1_speed, int p2_speedRoll, int turn, int p1_health){

        Random roll = new Random();

        if (p2_speed > p1_speed) {

            p2_speedRoll = roll.nextInt(1, 5);

            if (p2_speedRoll == 4) {

                turn = 2;

                System.out.println("■ ! ■ ! ■ ¡Eres más rápido que tu oponente! Actúas otro turno. ■ ! ■ ! ■");
                System.out.println(" ");

            }

            if (p1_health == 0) turn = 1;
        }

        return turn;

    }

}