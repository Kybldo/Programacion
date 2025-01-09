package Tema3;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Tema3CombatePeroConFunciones {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random roll = new Random();

        //Atributos de rondas, turnos, elecciones, selección de modo de juego, selección de clase...
        int choice_p1;
        int choice_p2 = 0;

        int choiceGame = 0;
        boolean computer = false;
        String computerTurn;
        int computerAI = 0;
        int computerHealthRoll;

        int gamemode = 0;

        int p1_classSelect = 0;
        String p1_className = " ";

        int p2_classSelect = 0;
        String p2_className = " ";

        int round = 0;

        int turn;

        //Atributos y variables para cálculos del primer jugador.
        int p1_statsTotal = 0;
        int p1_health = 0;
        int p1_attack = 0;
        int p1_defense = 0;
        int p1_speed = 0;
        int p1_statsLeft;

        int p1_regen;
        int p1_regenRoll;
        double p1_regenChance;
        int p1_healthMAX = 0;

        int p1_pity;
        double p1_channeling = 1;
        int p1_counter = 0;
        int p1_counterRoll;

        int p1_attackCalc = 0;
        int p1_attackRoll = 0;
        double p1_attackChance = 0;
        double p1_defenseChance = 0;

        int p1_speedRoll;

        //Atributos y variables para cálculos del segundo jugador.
        int p2_statsTotal = 0;
        int p2_health = 0;
        int p2_attack = 0;
        int p2_defense = 0;
        int p2_speed = 0;
        int p2_statsLeft;

        int p2_regen;
        int p2_regenRoll;
        double p2_regenChance;
        int p2_healthMAX = 0;

        int p2_pity;
        double p2_channeling = 1;
        int p2_counter = 0;
        int p2_counterRoll;

        int p2_attackCalc = 0;
        int p2_attackRoll = 0;
        double p2_attackChance = 0;
        double p2_defenseChance = 0;

        int p2_speedRoll;

        //Título del juego.
        FuncionesCombate.title();

        //Inicio del juego.
        while (choiceGame == 0 || choiceGame == 3){

            //Selección del modo de juego. También incluye la opción de ver una explicación de las funciones del juego.
            System.out.println("¿Cómo quieres jugar?");
            System.out.println("1. Jugador contra Jugador | 2. Solo contra la máquina | 3. Por querer quiero una explicación");

            choiceGame = read.nextInt();

            if (choiceGame == 3){

                FuncionesCombate.tutorial();

            }
        }

        //Activa la inteligencia artificial para las peleas contra la máquina.
        if (choiceGame == 2) computer = true;

        if (computer){

            System.out.println(" ");
            System.out.println("Selecciona un nivel de dificultad:");
            System.out.println("1. Descerebrado | 2. Cerebrado");

            computerAI = read.nextInt();

        }

        //Selección de personajes / estadísticas.
        System.out.println(" ");
        System.out.println("¿Cómo quieres que sean los personajes?");
        System.out.println("1. Personajes predeterminados | 2. Parámetros personalizados");

        //Elección del modo de juego (personajes fijos, personajes personalizados).
        while (gamemode == 0 || gamemode > 2){

            gamemode = read.nextInt();

            switch (gamemode){

                case 1 -> {

                    FuncionesCombate.classInfo();

                    while (p1_classSelect == 0 | p1_classSelect > 6){

                        System.out.println(" ");
                        System.out.println("Selecciona el personaje del primer jugador:");

                        p1_classSelect = read.nextInt();

                        switch (p1_classSelect){

                            case 1 -> {

                                p1_health = 105;
                                p1_attack = 175;
                                p1_defense = 80;
                                p1_speed = 140;

                                p1_healthMAX = 105;

                                p1_className = "TRABAJADOR DE PISCIFACTORÍA";

                            }

                            case 2 -> {

                                p1_health = 70;
                                p1_attack = 155;
                                p1_defense = 75;
                                p1_speed = 200;

                                p1_healthMAX = 70;

                                p1_className = "FUMADOR COMPULSIVO";

                            }

                            case 3 -> {

                                p1_health = 145;
                                p1_attack = 110;
                                p1_defense = 120;
                                p1_speed = 125;

                                p1_healthMAX = 145;

                                p1_className = "PROFESOR DE FOL";

                            }

                            case 4 -> {

                                p1_health = 150;
                                p1_attack = 90;
                                p1_defense = 180;
                                p1_speed = 80;

                                p1_healthMAX = 150;

                                p1_className = "TÍO DE 2 METROS";

                            }

                            case 5 -> {

                                p1_health = 200;
                                p1_attack = 99;
                                p1_defense = 200;
                                p1_speed = 1;

                                p1_healthMAX = 200;

                                p1_className = "APOLINAR";

                            }

                            case 6 -> {

                                p1_health = 150;
                                p1_attack = 200;
                                p1_defense = 148;
                                p1_speed = 2;

                                p1_healthMAX = 150;

                                p1_className = "ERIC";

                            }

                            default -> System.out.println("Introduce una clase válida.");

                        }
                    }

                    while (p2_classSelect == 0 | p2_classSelect > 6){

                        System.out.println(" ");
                        System.out.println("Selecciona el personaje del segundo jugador:");

                        p2_classSelect = read.nextInt();

                        switch (p2_classSelect){

                            case 1 -> {

                                p2_health = 105;
                                p2_attack = 175;
                                p2_defense = 80;
                                p2_speed = 140;

                                p2_healthMAX = 105;

                                p2_className = "TRABAJADOR DE PISCIFACTORÍA";

                            }

                            case 2 -> {

                                p2_health = 70;
                                p2_attack = 155;
                                p2_defense = 75;
                                p2_speed = 200;

                                p2_healthMAX = 70;

                                p2_className = "FUMADOR COMPULSIVO";

                            }

                            case 3 -> {

                                p2_health = 145;
                                p2_attack = 110;
                                p2_defense = 120;
                                p2_speed = 125;

                                p2_healthMAX = 145;

                                p2_className = "PROFESOR DE FOL";

                            }

                            case 4 -> {

                                p2_health = 150;
                                p2_attack = 90;
                                p2_defense = 180;
                                p2_speed = 80;

                                p2_healthMAX = 150;

                                p2_className = "TÍO DE 2 METROS";

                            }

                            case 5 -> {

                                p2_health = 200;
                                p2_attack = 99;
                                p2_defense = 200;
                                p2_speed = 1;

                                p2_healthMAX = 200;

                                p2_className = "APOLINAR";

                            }

                            case 6 -> {

                                p2_health = 150;
                                p2_attack = 200;
                                p2_defense = 148;
                                p2_speed = 2;

                                p2_healthMAX = 150;

                                p2_className = "ERIC";

                            }

                            default -> System.out.println("Introduce una clase válida.");

                        }
                    }
                }

                case 2 -> {

                    //Asignación manual del primer jugador.
                    System.out.println(" ");
                    System.out.println("Introduce los atributos del primer jugador.");
                    System.out.println("Ten en cuenta que el total no podrá superar 500.");
                    System.out.println(" ");

                    p1_className = "PERSONALIZADO";

                    while (p1_statsTotal == 0 || p1_statsTotal > 500) {

                        p1_health = 0;
                        p1_attack = 0;
                        p1_defense = 0;
                        p1_speed = 0;
                        p1_statsLeft = 500;

                        p1_healthMAX = 0;

                        while (p1_health <= 0 || p1_health > 200) {
                            System.out.println("Puntos de vida:");
                            p1_health = read.nextInt();

                            p1_healthMAX = p1_health;

                            if (p1_health <= 0 || p1_health > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p1_statsTotal = p1_health;
                        System.out.println("Total de atributos: " + p1_statsTotal);
                        System.out.println(" ");

                        p1_statsLeft -= p1_health;
                        System.out.println("Te quedan " + p1_statsLeft + " por asignar.");
                        System.out.println(" ");

                        while (p1_attack <= 0 || p1_attack > 200) {
                            System.out.println("Ataque:");
                            p1_attack = read.nextInt();

                            if (p1_attack <= 0 || p1_attack > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p1_statsTotal += p1_attack;
                        System.out.println("Total de atributos: " + p1_statsTotal);
                        System.out.println(" ");

                        p1_statsLeft -= p1_attack;
                        System.out.println("Te quedan " + p1_statsLeft + " por asignar.");
                        System.out.println(" ");

                        while (p1_defense <= 0 || p1_defense > 200) {
                            System.out.println("Defensa:");
                            p1_defense = read.nextInt();

                            if (p1_defense <= 0 || p1_defense > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p1_statsTotal += p1_defense;
                        System.out.println("Total de atributos: " + p1_statsTotal);
                        System.out.println(" ");

                        p1_statsLeft -= p1_defense;

                        if (p1_statsTotal > 500) {
                            System.out.println("Cuidado: Te has pasado del límite de puntos asignables. Termina la asignación y vuelve a empezar.");
                        } else if (p1_statsLeft <= 0) {
                            System.out.println("Cuidado: No te quedan puntos por asignar. Termina la asignación y vuelve a empezar.");
                        } else System.out.println("Te quedan " + p1_statsLeft + " por asignar.");
                        System.out.println(" ");

                        while (p1_speed <= 0 || p1_speed > 200) {
                            System.out.println("Velocidad:");
                            p1_speed = read.nextInt();

                            if (p1_speed <= 0 || p1_speed > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p1_statsTotal += p1_speed;

                        System.out.println("El total de atributos del primer jugador es: " + p1_statsTotal);
                        System.out.println(" ");

                        if (p1_statsTotal > 500) {
                            System.out.println("La suma total de los atributos no puede superar 500.");
                            System.out.println(" ");
                        }
                    }

                    //Asignación manual del segundo jugador.
                    System.out.println("Introduce los atributos del segundo jugador.");
                    System.out.println("Ten en cuenta que el total no podrá superar 500.");
                    System.out.println(" ");

                    p2_className = "PERSONALIZADO";

                    while (p2_statsTotal == 0 || p2_statsTotal > 500) {

                        p2_health = 0;
                        p2_attack = 0;
                        p2_defense = 0;
                        p2_speed = 0;
                        p2_statsLeft = 500;

                        p2_healthMAX = 0;

                        while (p2_health <= 0 || p2_health > 200) {
                            System.out.println("Puntos de vida:");
                            p2_health = read.nextInt();

                            p2_healthMAX = p2_health;

                            if (p2_health <= 0 || p2_health > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p2_statsTotal = p2_health;
                        System.out.println("Total de atributos: " + p2_statsTotal);
                        System.out.println(" ");

                        p2_statsLeft -= p2_health;
                        System.out.println("Te quedan " + p2_statsLeft + " por asignar.");
                        System.out.println(" ");

                        while (p2_attack <= 0 || p2_attack > 200) {
                            System.out.println("Ataque:");
                            p2_attack = read.nextInt();

                            if (p2_attack <= 0 || p2_attack > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p2_statsTotal += p2_attack;
                        System.out.println("Total de atributos: " + p2_statsTotal);
                        System.out.println(" ");

                        p2_statsLeft -= p2_attack;
                        System.out.println("Te quedan " + p2_statsLeft + " por asignar.");
                        System.out.println(" ");

                        while (p2_defense <= 0 || p2_defense > 200) {
                            System.out.println("Defensa:");
                            p2_defense = read.nextInt();

                            if (p2_defense <= 0 || p2_defense > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p2_statsTotal += p2_defense;
                        System.out.println("Total de atributos: " + p1_statsTotal);
                        System.out.println(" ");
                        p2_statsLeft -= p2_defense;

                        if (p2_statsTotal > 500) {
                            System.out.println("Cuidado: Te has pasado del límite de puntos asignables. Termina la asignación y vuelve a empezar.");
                        } else if (p2_statsLeft <= 0) {
                            System.out.println("Cuidado: No te quedan puntos por asignar. Termina la asignación y vuelve a empezar.");
                        } else System.out.println("Te quedan " + p2_statsLeft + " por asignar.");
                        System.out.println(" ");

                        while (p2_speed <= 0 || p2_speed > 200) {
                            System.out.println("Velocidad:");
                            p2_speed = read.nextInt();

                            if (p2_speed <= 0 || p2_speed > 200) {
                                System.out.println("Ninguno de tus atributos puede ser 0, negativo, o superar 200.");
                                System.out.println(" ");
                            }
                        }

                        p2_statsTotal += p2_speed;

                        System.out.println("El total de atributos del segundo jugador es: " + p2_statsTotal);
                        System.out.println(" ");

                        if (p2_statsTotal > 500) {
                            System.out.println("La suma total de los atributos no puede superar 500.");
                            System.out.println(" ");
                        }
                    }
                }

                default -> System.out.println("Introduce un modo de juego válido.");

            }
        }

        //Para darle un poco de aire a esto, que no se puede limpiar la consola en Intellij.
        System.out.println(" ");

        //Presenta las estadísticas antes de empezar la partida.
        System.out.println("Jugador 1" + " (" + p1_className + ")" + ":");
        System.out.println("Vida: " + p1_health + " Ataque: " + p1_attack + " Defensa: " + p1_defense + " Velocidad: " + p1_speed);
        System.out.println(" ");
        System.out.println("Jugador 2" + " (" + p2_className + ")" + ":");
        System.out.println("Vida: " + p2_health + " Ataque: " + p2_attack + " Defensa: " + p2_defense + " Velocidad: " + p2_speed);
        System.out.println(" ");

        //Decide el orden del primer turno.
        if (p1_speed > p2_speed) {
            turn = 1;
        } else turn = 2;

        //El bucle de la pelea.
        while (p1_health > 0 || p2_health > 0) {

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

            //Aumenta e imprime las rondas transcurridas.
            round++;
            System.out.println(" ");
            System.out.print("RONDA " + round);

            //Decide el turno inicial.
            if (turn == 1){

                System.out.print(" - TURNO DEL JUGADOR 1");

            } else System.out.print(" - TURNO DEL JUGADOR 2");

            System.out.println(" ");

            //Acciones del primer jugador. Se entrará en el switch si la variable "turn" equivale a 1.
            switch (turn){

                case 1 -> {

                    FuncionesCombate.combatMenu(p1_className);

                    choice_p1 = read.nextInt();

                    switch (choice_p1) {

                        case 1 -> {

                            p1_attackCalc = FuncionesCombate.attack(p1_attackChance, p2_defenseChance, p1_attackRoll, p1_attackCalc, p1_attack, p1_channeling, p2_defense, p1_counter);

                            p2_health -= p1_attackCalc;

                            p1_channeling = 1;
                            p1_counter = 0;

                            if (p1_health < 0) p1_health = 0;
                            if (p2_health < 0) p2_health = 0;

                            System.out.println("Has causado " + p1_attackCalc + " puntos de daño.");
                            System.out.println(" ");

                        }

                        case 2 -> {

                            p1_regenRoll = roll.nextInt(1, 3);
                            p1_regenChance = roll.nextDouble(0.5, 0.9);

                            p1_regen = (int) (p1_regenRoll + (p1_healthMAX * p1_regenChance) * 0.2);

                            if (p1_healthMAX == p1_health){

                                System.out.println("Tu vida está al máximo. No puedes regenarar.");

                            } else {

                                p1_health += p1_regen;

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

                                System.out.println("Has regenerado " + p1_regen + " puntos de vida.");
                                System.out.println(" ");

                                if (p1_health > p1_healthMAX){

                                    p1_health = p1_healthMAX;

                                    System.out.println("Tu vida está al máximo.");
                                    System.out.println(" ");

                                }
                            }
                        }

                        case 3 -> {

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

                            p1_pity = roll.nextInt(0, 101);

                            if (p1_pity == 100){

                                System.out.println("¡El enemigo se compadece de ti y te deja ganar la pelea!");
                                p2_health = 0;

                            } else System.out.println("Pero no ha funcionado.");

                            System.out.println(" ");

                        }

                        case 4 -> {

                            System.out.println("¡Has canalizado energía!");
                            System.out.println("Tu siguiente ataque será más poderoso.");
                            System.out.println(" ");

                            p1_channeling = 2;

                        }

                        case 5 -> {

                            if (p2_attackCalc == 0){

                                System.out.println("El enemigo todavía no te ha atacado. No has podido absorber.");
                                System.out.println(" ");

                            } else {

                                p1_counterRoll = roll.nextInt(1, 3);

                                if (p1_counterRoll == 2){

                                    System.out.println("¡Has absorbido la potencia del ataque de tu enemigo!");
                                    System.out.println("Tu siguiente ataque será más poderoso.");
                                    System.out.println(" ");

                                    p1_counter = p2_attackCalc;

                                    p2_attackCalc = 0;

                                } else {

                                    System.out.println("¡Tu reflejo ha fallado!");
                                    System.out.println("Has recibido " + p2_attackCalc / 2 + " puntos de daño adicionales.");
                                    System.out.println(" ");

                                    p1_health -= p2_attackCalc / 2;

                                    p2_attackCalc = 0;

                                    if (p1_health < 0) p1_health = 0;

                                }
                            }
                        }

                        default -> {

                            System.out.println(" ");
                            System.out.println("Desperdiciaste el turno.");
                            System.out.println(" ");

                        }

                    }

                    turn = 2;

                    if (p1_speed > p2_speed) {

                        p1_speedRoll = roll.nextInt(1, 5);

                        if (p1_speedRoll == 4) {

                            turn = 1;

                            System.out.println("■ ! ■ ! ■ ¡Eres más rápido que tu oponente! Actúas otro turno. ■ ! ■ ! ■");
                            System.out.println(" ");

                        }

                        if (p2_health == 0) turn = 2;
                    }

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

                    if (computer){

                        System.out.println(" ");
                        System.out.println("Pulsa Enter para continuar.");
                        computerTurn = read.nextLine();
                        computerTurn = read.nextLine();

                        System.out.println(computerTurn);

                    }
                }

                //Acciones del segundo jugador. Se entrará en el switch si la variable "turn" equivale a 2.
                case 2 -> {

                   if (computer){

                        switch (computerAI){

                            case 1 -> choice_p2 = roll.nextInt(1, 6);

                            case 2 -> {

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

                            }
                        }

                    } else {

                        System.out.println("Jugador 2" + " (" + p2_className + ")" + " - Elige una acción:");
                        System.out.println("1. Ataque | 2. Regenerar | 3. Pedir Perdón | 4. Canalizar | 5. Reflejar");
                        System.out.println(" ");

                        choice_p2 = read.nextInt();

                    }

                    switch (choice_p2) {

                        case 1 -> {

                            p2_attackCalc = FuncionesCombate.attack(p2_attackChance, p1_defenseChance, p2_attackRoll, p2_attackCalc, p2_attack, p2_channeling, p1_defense, p2_counter);

                            p1_health -= p2_attackCalc;

                            p2_channeling = 1;
                            p2_counter = 0;

                            if (p2_health < 0) p2_health = 0;
                            if (p1_health < 0) p1_health = 0;

                            System.out.println("Has causado " + p2_attackCalc + " puntos de daño.");
                            System.out.println(" ");

                        }

                        case 2 -> {

                            p2_regenRoll = roll.nextInt(1, 3);
                            p2_regenChance = roll.nextDouble(0.5, 0.9);

                            p2_regen = (int) (p2_regenRoll + (p2_healthMAX * p2_regenChance) * 0.2);

                            if (p2_healthMAX == p2_health){

                                System.out.println("Tu vida está al máximo. No puedes regenarar.");

                            } else {

                                p2_health += p2_regen;

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

                                System.out.println("Has regenerado " + p2_regen + " puntos de vida.");
                                System.out.println(" ");

                                if (p2_health > p2_healthMAX) {

                                    p2_health = p2_healthMAX;

                                    System.out.println("Tu vida está al máximo.");
                                    System.out.println(" ");

                                }
                            }
                        }

                        case 3 -> {

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

                            p2_pity = roll.nextInt(0, 101);

                            if (p2_pity == 100){

                                System.out.println("¡El enemigo se compadece de ti y te deja ganar la pelea!");
                                p1_health = 0;

                            } else System.out.println("Pero no ha funcionado.");

                            System.out.println(" ");

                        }

                        case 4 -> {

                            System.out.println("¡Has canalizado energía!");
                            System.out.println("Tu siguiente ataque será más poderoso.");
                            System.out.println(" ");

                            p2_channeling = 2;

                        }

                        case 5 -> {

                            if (p1_attackCalc == 0){

                                System.out.println("El enemigo todavía no te ha atacado. No has podido absorber.");
                                System.out.println(" ");

                            } else {

                                p2_counterRoll = roll.nextInt(1, 3);

                                if (p2_counterRoll == 2) {

                                    System.out.println("¡Has absorbido la potencia del ataque de tu enemigo!");
                                    System.out.println("Tu siguiente ataque será más poderoso.");
                                    System.out.println(" ");

                                    p2_counter = p1_attackCalc;

                                    p1_attackCalc = 0;

                                } else {

                                    System.out.println("¡Tu reflejo ha fallado!");
                                    System.out.println("Has recibido " + p1_attackCalc / 2 + " puntos de daño adicionales.");
                                    System.out.println(" ");

                                    p2_health -= p1_attackCalc / 2;

                                    p1_attackCalc = 0;

                                    if (p2_health < 0) p2_health = 0;

                                }
                            }
                        }

                        default -> {

                            System.out.println(" ");
                            System.out.println("Desperdiciaste el turno.");
                            System.out.println(" ");

                        }

                    }

                    turn = 1;

                    if (p2_speed > p1_speed) {

                        p2_speedRoll = roll.nextInt(1, 5);

                        if (p2_speedRoll == 4) {

                            turn = 2;

                            System.out.println("■ ! ■ ! ■ ¡Eres más rápido que tu oponente! Actúas otro turno. ■ ! ■ ! ■");
                            System.out.println(" ");

                        }

                        if (p1_health == 0) turn = 1;
                    }

                    System.out.println("Jugador 1" + " (" + p1_className + ")");
                    System.out.println("Vida: " + p1_health + " ");

                    for (int i = 0; i < p1_health; i = i + 2){
                        System.out.print("■");
                    }

                    System.out.println(" ");
                    System.out.println("Jugador 2" + " (" + p2_className + ")");
                    System.out.println("Vida: " + p2_health + " ");

                    for (int i = 0; i < p2_health; i = i + 2){
                        System.out.print("■");
                    }

                    System.out.println(" ");

                }
            }

            System.out.println(" ");

            //Determina si el juego tiene que terminar.
            if (computer){

                if (p1_health == 0 || p2_health == 0){

                    if (p1_health > p2_health){
                        System.out.println("¡Ha ganado el jugador 1!");

                    } else System.out.println("¡Ha ganado la máquina!");

                    p1_health = 0;
                    p2_health = 0;

                }

            } else {

                if (p1_health == 0 || p2_health == 0){

                    if (p1_health > p2_health){
                        System.out.println("¡Ha ganado el jugador 1!");

                    } else System.out.println("¡Ha ganado el jugador 2!");

                    p1_health = 0;
                    p2_health = 0;

                }
            }
        }

        read.close();

    }
}