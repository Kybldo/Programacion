package Tema2;

import java.util.Scanner;

public class Tema2EjercicioProgramacionEstructurada {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int choice_p1 = 0;
        int choice_p2 = 0;

        int turn = 0;

        //Atributos del primer jugador.
        int p1_statsTotal = 0;
        int p1_health = 0;
        int p1_attack = 0;
        int p1_defense = 0;
        int p1_speed = 0;
        int p1_statsLeft = 500;

        //Atributos del segundo jugador.
        int p2_statsTotal = 0;
        int p2_health = 0;
        int p2_attack = 0;
        int p2_defense = 0;
        int p2_speed = 0;
        int p2_statsLeft = 500;

        //Título del juego.
        System.out.println("EL JUEGO DE PEGARSE");
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

            while (p1_health <= 0 || p1_health > 200) {
                System.out.println("Puntos de vida:");
                p1_health = read.nextInt();

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

            while (p2_health <= 0 || p2_health > 200) {
                System.out.println("Puntos de vida:");
                p2_health = read.nextInt();

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

        while (p1_health > 0 || p2_health > 0) {

            if (p1_speed > p2_speed) {
                turn = 1;
            } else turn = 2;

            switch (turn){

                case 1 -> {
                    System.out.println("Jugador 1 - Elige una acción:");
                    System.out.println("1. Ataque | 2. Regenerar");
                    System.out.println(" ");

                    choice_p1 = read.nextInt();

                    switch (choice_p1) {

                        case 1 -> {

                            System.out.println("Atacaste");

                        }

                        case 2 -> {

                            System.out.println("Regeneraste");

                        }
                    }

                    turn = 2;

                }

                case 2 -> {

                    System.out.println("Jugador 2 - Elige una acción:");
                    System.out.println("1. Ataque | 2. Regenerar");
                    System.out.println(" ");

                    choice_p2 = read.nextInt();

                    switch (choice_p2) {

                        case 1 -> {

                            System.out.println("Atacaste");

                        }

                        case 2 -> {

                            System.out.println("Regeneraste");

                        }
                    }

                    turn = 1;

                }
            }
        }
    }
}