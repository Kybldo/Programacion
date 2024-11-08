package Tema2;

import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection")
public class Tema2EjercicioProgramacionEstructurada {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Random roll = new Random();

        //Atributos de rondas, turnos, elecciones.
        int choice_p1 = 0;
        int choice_p2 = 0;

        int round = 0;

        int turn = 0;

        //Atributos del primer jugador.
        int p1_statsTotal = 0;
        int p1_health = 0;
        int p1_attack = 0;
        int p1_defense = 0;
        int p1_speed = 0;
        int p1_statsLeft = 500;

        int p1_regen = 0;
        int p1_regenRoll = 0;
        double p1_regenChance = 0;
        int p1_healthMAX = 0;

        //Atributos y cálculos de ataque del primer jugador.
        int p1_attackCalc = 0;
        int p1_attackRoll = 0;
        double p1_attackChance = 0;
        double p1_defenseChance = 0;

        //Atributos del segundo jugador.
        int p2_statsTotal = 0;
        int p2_health = 0;
        int p2_attack = 0;
        int p2_defense = 0;
        int p2_speed = 0;
        int p2_statsLeft = 500;

        int p2_regen = 0;
        int p2_regenRoll = 0;
        double p2_regenChance = 0;
        int p2_healthMAX = 0;

        //Atributos y cálculos de ataque del primer jugador.
        int p2_attackCalc = 0;
        int p2_attackRoll = 0;
        double p2_attackChance = 0;
        double p2_defenseChance = 0;

        //Título del juego.
        System.out.println(" ");
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
                                            \\$$$$$$  |                    \\$$$$$$  |                                          $$ |                \\$$$$$$  |                                       \s
                                             \\______/                      \\______/                                           \\__|                 \\______/                                        \s""");
        System.out.println(" ");

        //Asignación manual del primer jugador.
        System.out.println("Introduce los atributos del primer jugador.");
        System.out.println("Ten en cuenta que el total no podrá superar 500.");
        System.out.println(" ");

        while (p1_statsTotal == 0 || p1_statsTotal > 500) {

            p1_statsTotal = 0;
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

        while (p2_statsTotal == 0 || p2_statsTotal > 500) {

            p2_statsTotal = 0;
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

        //Para darle un poco de aire a esto, que no se puede limpiar la consola en Intellij.
        System.out.println(" ");

        System.out.println("Jugador 1:");
        System.out.println("Vida: " + p1_health + " Ataque: " + p1_attack + " Defensa: " + p1_defense + " Velocidad: " + p1_speed);
        System.out.println(" ");
        System.out.println("Jugador 2:");
        System.out.println("Vida: " + p2_health + " Ataque: " + p2_attack + " Defensa: " + p2_defense + " Velocidad: " + p2_speed);
        System.out.println(" ");

        //Decide el orden del primer turno.
        if (p1_speed > p2_speed) {
            turn = 1;
        } else turn = 2;

        while (p1_health > 0 || p2_health > 0) {

            round++;
            System.out.println("RONDA " + round);
            System.out.println(" ");

            switch (turn){

                case 1 -> {
                    System.out.println("Jugador 1 - Elige una acción:");
                    System.out.println("1. Ataque | 2. Regenerar");
                    System.out.println(" ");

                    choice_p1 = read.nextInt();

                    switch (choice_p1) {

                        case 1 -> {

                            p1_attackChance = roll.nextDouble(0.2, 0.4);
                            p2_defenseChance = roll.nextDouble(0.1, 0.2);

                            p1_attackRoll = roll.nextInt(1, 4);

                            p1_attackCalc = (int) (((p1_attack * p1_attackChance * 3) * p1_attackRoll) / (p2_defense * p2_defenseChance));

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

                            if (p1_attackRoll == 3){
                                System.out.println("¡Golpe Súper Crítico!");
                            } else if (p1_attackRoll == 2) {
                                System.out.println("¡Golpe Crítico!");
                            } else System.out.println("Has golpeado al jugador 2.");
                            System.out.println(" ");

                            p2_health -= p1_attackCalc;

                            if (p2_health < 0) p2_health = 0;

                            System.out.println("Has causado " + p1_attackCalc + " puntos de daño.");
                            System.out.println(" ");

                        }

                        case 2 -> {

                            p1_regenRoll = roll.nextInt(1, 3);
                            p1_regenChance = roll.nextDouble(0.5, 0.9);

                            p1_regen = (int) (p1_regenRoll + (p1_health * p1_regenChance) * 0.2);

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
                    }

                    turn = 2;

                    System.out.println("Jugador 1:");
                    System.out.println("Vida: " + p1_health);
                    System.out.println(" ");
                    System.out.println("Jugador 2:");
                    System.out.println("Vida: " + p2_health);
                    System.out.println(" ");

                }

                case 2 -> {

                    System.out.println("Jugador 2 - Elige una acción:");
                    System.out.println("1. Ataque | 2. Regenerar");
                    System.out.println(" ");

                    choice_p2 = read.nextInt();

                    switch (choice_p2) {

                        case 1 -> {

                            p2_attackChance = roll.nextDouble(0.2, 0.4);
                            p1_defenseChance = roll.nextDouble(0.1, 0.2);

                            p2_attackRoll = roll.nextInt(1, 3);

                            p2_attackCalc = (int) (((p2_attack * p2_attackChance * 3) * p2_attackRoll) / (p1_defense * p1_defenseChance));

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

                            if (p2_attackRoll == 3){
                                System.out.println("¡Golpe Súper Crítico!");
                            } else if (p2_attackRoll == 2) {
                                System.out.println("¡Golpe Crítico!");
                            } else System.out.println("Has golpeado al jugador 2.");
                            System.out.println(" ");

                            p1_health -= p2_attackCalc;

                            if (p1_health < 0) p2_health = 0;

                            System.out.println("Has causado " + p2_attackCalc + " puntos de daño.");
                            System.out.println(" ");

                        }

                        case 2 -> {

                            p2_regenRoll = roll.nextInt(1, 3);
                            p2_regenChance = roll.nextDouble(0.5, 0.9);

                            p2_regen = (int) (p2_regenRoll + (p2_health * p2_regenChance) * 0.2);

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
                    }

                    turn = 1;

                    System.out.println("Jugador 1:");
                    System.out.println("Vida: " + p1_health);
                    System.out.println(" ");
                    System.out.println("Jugador 2:");
                    System.out.println("Vida: " + p2_health);
                    System.out.println(" ");

                }
            }

            if (p1_health > p2_health){

                System.out.println("¡Ha ganado el jugador 1!");

            } else System.out.println("¡Ha ganado el jugador 2!");

        }

        read.close();

    }
}